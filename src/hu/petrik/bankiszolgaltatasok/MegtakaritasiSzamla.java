package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla {
    private double kamat;
    public static double alapKamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        alapKamat = this.kamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (this.aktualisEgyenleg - osszeg >= 0) {
            this.aktualisEgyenleg -= osszeg;
            return true;
        } else {
            return false;
        }
    }

    public void kamatJovairas() {

    }
}
