package hu.petrik.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista;

    public Bank() {
        this.szamlaLista = new ArrayList<>();
    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret) {
        Szamla szamla;
        if (hitelKeret > 0) {
            szamla = new HitelSzamla(tulajdonos,hitelKeret);

        } else {
            szamla = new MegtakaritasiSzamla(tulajdonos);
        }
        this.szamlaLista.add(szamla);
        return szamla;
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
        for (Szamla szamla : this.szamlaLista) {
            if (szamla.getClass().equals(HitelSzamla.class)) {
                ossz = ossz + ((HitelSzamla) szamla).getHitelKeret();
            }
        }
        return ossz;
    }

}
