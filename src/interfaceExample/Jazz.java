package interfaceExample;

public abstract class Jazz implements Mobil {

}

class Tampil extends Jazz {
    public void nama(){
        System.out.println("Mobil honda jazz");
    }

    public void warna(){
        System.out.println("warna hitam");
    }
}
