/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author CSjes
 */
public class MenuScrollableA extends JComponent {

    public EventoMenu getEvent() {
        return event;
    }

    public void setEvent(EventoMenu event) {
        this.event = event;
    }

    private EventoMenu event;
    private MigLayout layout;
    private String[][] componentesMenu = new String[][]{
        {"Usuarios", "Alta empleado", "Baja Empleado", "Alta proveedor", "Baja proveedor"},
        {"Inventario", "Alta producto", "Baja producto"},
        {"Cerrar Sesión"}
    };

    public MenuScrollableA() {
        init();
    }

    public void init() {
        layout = new MigLayout("wrap 1, fillx, gapy 0, inset 2", "fill");
        setLayout(layout);
        setOpaque(true);
        for (int i = 0; i < componentesMenu.length; i++) {
            addMenu(componentesMenu[i][0], i);
        }
    }

    private Icon getIcon(int index) {
        URL url = getClass().getResource("/imagenesMadereria/MAdmin" + index + ".png");
        if (url != null) {
            return new ImageIcon(url);
        } else {
            return null;
        }
    }

    private void addMenu(String menuName, int index) {
        int length = componentesMenu[index].length;
        ComponenteMenu item = new ComponenteMenu(menuName, index, length > 1);
        Icon icon = getIcon(index);
        if (icon != null) {
            item.setIcon(icon);
        }
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (length > 1) {
                    if (!item.isSelected()) {
                        item.setSelected(true);
                        addsubMenu(item, index, length, getComponentZOrder(item));
                    } else {
                        hideMenu(item, index);
                        item.setSelected(false);
                    }
                } else {
                    if (event != null) {
                        event.selected(index, 0);
                    }
                }
            }
        });
        item.setFont(new Font("Roboto", Font.BOLD, 14));
        item.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(item);
        revalidate();
        repaint();
    }

    private void addsubMenu(ComponenteMenu item, int index, int length, int indexZorder) {
        JPanel panel = new JPanel(new MigLayout("wrap 1, fillx, gapy 0, inset 2", "fill"));
        panel.setName(Integer.toString(index));
        panel.setOpaque(false);
        for (int i = 1; i < length; i++) {
            ComponenteMenu subitem = new ComponenteMenu(componentesMenu[index][i], i, false);
            subitem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (event != null) {
                        event.selected(index, subitem.getIndex());
                    }
                }
            });
            subitem.initSubMenu(i, length);
            panel.add(subitem);
        }
        add(panel, "h 0!", indexZorder + 1);
        revalidate();
        repaint();
        AnimacionMenu.showMenu(panel, item, layout, true);
    }

    private void hideMenu(ComponenteMenu item, int index) {
        for (Component com : getComponents()) {
            if (com instanceof JPanel && com.getName() != null && com.getName().equals(Integer.toString(index))) {
                com.setName(null);
                AnimacionMenu.showMenu(com, item, layout, false);
                break;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(new Color(217, 217, 217));
        g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
        super.paintComponent(g);
    }

}
