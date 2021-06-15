package interfaceExample;

public class main {
    public static void main(String[] args) {

        Mobil car = new Tampil();
        car.nama();
        car.warna();

        System.out.println("-----");

        Motor mtr = new Print();
        mtr.nama();
        mtr.warna();
    }
}
