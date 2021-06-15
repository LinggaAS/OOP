package user;

public class Bank {
    String name;

    void Hello(String name){
        System.out.println("Halo " + name + ", saya " + this.name + " dari bank Indonesia");
    }
}

class Indonesia extends Bank {

}

class Mandiri extends Bank {

    void Hello(String name){
        System.out.println("Halo " + name + ", saya " + this.name + " dari bank Mandiri");
    }
}

class BCA extends Mandiri{

    void Hello(String name){
        System.out.println("Halo " + name + ", saya " + this.name + " dari bank BCA");
    }
}

class telkomsel extends BCA {
    void Hello(String name) {
        System.out.println("Halo " + name + ", saya " + this.name + " dari telkomsel");
    }
}