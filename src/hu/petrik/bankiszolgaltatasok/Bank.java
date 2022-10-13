package hu.petrik.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista;

    public Bank() {
        this.szamlaLista = new ArrayList<>();
    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret) {
    }

    public long getOsszegyenleg(Tulajdonos tulajdonos) {
        long ossz = 0;
        for (Szamla s : this.szamlaLista) {
            if (s.getTulajdonos().equals(tulajdonos)) {
                ossz = s.getAktualisEgyenleg();
            }
        }
        return ossz;
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {
        Szamla max = this.szamlaLista.get(0);
        for (Szamla s : this.szamlaLista) {
            if (s.aktualisEgyenleg > max.getAktualisEgyenleg()) {
                max = s;
            }
        }
        return max;
    }


    public long getOsszhitelkeret() {
        long ossz = 0;
        for (Szamla s : this.szamlaLista) {
            if (s.getClass().equals(MegtakaritasiSzamla.class)) {
                ossz = ossz + s.getAktualisEgyenleg();
            }

        }
        return ossz;
    }

}
