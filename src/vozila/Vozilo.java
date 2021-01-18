package vozila;

public abstract class Vozilo {
    private String Marka, Tip;
    public Vozilo(String Marka, String Tip){
        this.Marka=Marka;
        this.Tip=Tip;
    }
    public abstract double proracunProsecnePotrosnje();

}
