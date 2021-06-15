package interfaceExample;

public abstract class Vario implements Motor {

}

class Print extends Vario{
    public void nama(){
        System.out.println("Motor Vario");
    }

    public void warna(){
        System.out.println("warna putih");
    }
}
