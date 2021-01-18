package teretnjaci;
import vozila.Vozilo;
import putovanja.*;
public class Kamion extends Vozilo {
    private String model;
    private double masa;
    public int brojPutovanja;
    private Put[] putovanja;

    public Kamion(String Marka, String Tip, String model, double masa, int brojPutovanja) {
        super(Marka, Tip);
        this.model = model;
        this.masa = masa;
        this.brojPutovanja = brojPutovanja;
        putovanja = new Put[brojPutovanja];
        for (int i = 0; i < putovanja.length; i++)
            putovanja[i] = new Put();
    }

    public void upis(double ruta, double potrosenoGorivo, int mesto) {
        if (mesto < putovanja.length) {
            if ((putovanja[mesto].getRuta() == 0) && (putovanja[mesto].getPotrosenoGorivo() == 0)) {
                putovanja[mesto].setPotrosenoGorivo(potrosenoGorivo);
                putovanja[mesto].setRuta(ruta);
            } else {
                System.out.println("Greska");
            }
        }
    }

    public double proracunProsecnePotrosnje() {
        double prosecnaPotrosnja = 0;
        double ukupnoGorivo = 0;
        for (int i = 0; i < putovanja.length; i++) {
            if ((putovanja[i].getPotrosenoGorivo() != 0) && (putovanja[i].getRuta() != 0)) {
                prosecnaPotrosnja += putovanja[i].getRuta();
                ukupnoGorivo += putovanja[i].getPotrosenoGorivo();
            }
        }
        return prosecnaPotrosnja * 100 / ukupnoGorivo;
    }
}
