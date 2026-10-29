public class Robot {

    private int anzahlKomponenten;
    private boolean zustand;
    private int akkustand;
    private String farbe;
    private boolean istInBewegung;

    public Robot (int anzahlKomponenten, boolean zustand, int akkustand, String farbe, boolean istInBewegung) {
        this.anzahlKomponenten = anzahlKomponenten;
        this.zustand = zustand;
        this.akkustand = akkustand;
        this.farbe = farbe;
        this.istInBewegung = istInBewegung;
    }

    // GETTERS
    public int getAnzahlKomponenten() {
        return anzahlKomponenten;
    }
    public boolean isZustand() {
        return zustand;
    }
    public int getAkkustand() {
        return akkustand;
    }
    public String getFarbe() {
        return farbe;
    }
    public boolean isIstInBewegung() {
        return this.istInBewegung;
    }

    // SETTERS
    public void setAnzahlKomponenten(int anzahlKomponenten) {
        this.anzahlKomponenten = anzahlKomponenten;
    }
    public void setZustand(boolean zustand) {
        this.zustand = zustand;
    }
    public void setAkkustand(int akkustand) {
        this.akkustand = akkustand;
    }
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public void setIstInBewegung(boolean istInBewegung) {
        this.istInBewegung = istInBewegung;
    }
}