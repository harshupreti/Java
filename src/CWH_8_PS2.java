//Create a class cellphone with the methods for ringing, vibrating

class Cellphone {
    public void ringing() {
        System.out.println("ringing...");
    }

    public void vibrating() {
        System.out.println("vibrating...");
    }

}

public class CWH_8_PS2 {
    public static void main(String[] args) {
        Cellphone cell = new Cellphone();
        cell.ringing();
        cell.vibrating();
    }
}
