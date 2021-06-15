package user;

public class main {
    public static void main(String[] args) {
        var bank = new Bank();
        bank.name = "Eko";
        bank.Hello("Deddy");

        var indo = new Indonesia();
        indo.name = "Arif";
        bank.Hello("Taopik");

        var mandiri = new Mandiri();
        mandiri.name = "Bambang";
        mandiri.Hello("Budi");

        Bank poly = new BCA();
        poly.name = "Asep";
        poly.Hello("Yusuf");

        Bank tsel = new telkomsel();
        tsel.name = "abdee";
        tsel.Hello("nadiem");
    }
}
