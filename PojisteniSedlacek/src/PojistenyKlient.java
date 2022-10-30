public class PojistenyKlient {

    // Jméno pojištěného
    private String jmeno;
    // Příjmení pojištěného
    private String prijmeni;
    // Věk pojištěného v letech
    private int vek;
    // Telefonní číslo pojištěného - celé číslo o 9 místech
    private int telefon;

    //
    public PojistenyKlient (String jmeno, String prijmeni, int vek, int telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return (jmeno + "   " + prijmeni + "   " + vek + "   " + telefon);
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }
}
