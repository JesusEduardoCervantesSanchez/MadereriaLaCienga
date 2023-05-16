package entidades;

public class Producto {
    private int clvprod;
    private String tipop;
    private int existenciap;
    private String categoriap;
    private double preciovp;
    private double gananciap;
    private double preciop;
    private double medidasp;

    public Producto() {
    }

    public Producto(int clvprod, String tipop, int existenciap, String categoriap, double preciovp, double gananciap, double preciop, double medidasp) {
        this.clvprod = clvprod;
        this.tipop = tipop;
        this.existenciap = existenciap;
        this.categoriap = categoriap;
        this.preciovp = preciovp;
        this.gananciap = gananciap;
        this.preciop = preciop;
        this.medidasp = medidasp;
    }

    public Producto(int clvprod) {
        this.clvprod = clvprod;
    }
    
    

    public int getClvprod() {
        return clvprod;
    }

    public void setClvprod(int clvprod) {
        this.clvprod = clvprod;
    }

    public String getTipop() {
        return tipop;
    }

    public void setTipop(String tipop) {
        this.tipop = tipop;
    }

    public int getExistenciap() {
        return existenciap;
    }

    public void setExistenciap(int existenciap) {
        this.existenciap = existenciap;
    }

    public String getCategoriap() {
        return categoriap;
    }

    public void setCategoriap(String categoriap) {
        this.categoriap = categoriap;
    }

    public double getPreciovp() {
        return preciovp;
    }

    public void setPreciovp(double preciovp) {
        this.preciovp = preciovp;
    }

    public double getGananciap() {
        return gananciap;
    }

    public void setGananciap(double gananciap) {
        this.gananciap = gananciap;
    }

    public double getPreciop() {
        return preciop;
    }

    public void setPreciop(double preciop) {
        this.preciop = preciop;
    }

    public double getMedidasp() {
        return medidasp;
    }

    public void setMedidasp(double medidasp) {
        this.medidasp = medidasp;
    }
    
    //@Override
    //public String toString() {
      //  return "Producto{" + "clvprod=" + clvprod + ", tipop=" + tipop + ", existenciap=" + existenciap + ", categoriap=" + categoriap + ", preciovp=" + preciovp + ", gananciap=" + gananciap + ", preciop=" + preciop + ", medidasp=" + medidasp + '}';
    //}
    
    @Override
    public String toString()
    {
        return clvprod+"";
    }
}
