package hu.petrik.bankiszolgaltatasok;

public class Main {
    public static void main(String[] args) {
        Tulajdonos tulajdonos = new Tulajdonos("Gyuri");
        Tulajdonos tulajdonos2 = new Tulajdonos("Marika");
        Bank bank = new Bank();
        Szamla szamla1 = bank.szamlanyitas(tulajdonos, 0);
        System.out.println(szamla1.getClass());
        System.out.println(HitelSzamla.class);
        bank.szamlanyitas(tulajdonos2, 150);
        System.out.println(bank.getOsszegyenleg(tulajdonos));
        System.out.println(bank.getOsszegyenleg(tulajdonos2));
        System.out.println(bank.getOsszhitelkeret());
        System.out.println(bank.getLegnagyobbEgyenleguSzamla(tulajdonos));
        System.out.println(bank.getLegnagyobbEgyenleguSzamla(tulajdonos2));

    }
}
