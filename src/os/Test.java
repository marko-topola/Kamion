package os;

import teretnjaci.Kamion;;
public class Test {
    public static void main(String[] args){
        Kamion kamion = new Kamion("Mercedes", "Benz", "Atego", 15000, 4);
        kamion.upis(2000, 600, 2);
        kamion.upis(31500, 1800, 1);
        System.out.println(" Prosecna potrosnja je "+kamion.proracunProsecnePotrosnje());
    }

}