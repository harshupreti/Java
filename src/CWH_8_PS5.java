//TO create a class Tommy Vercetti and create methods hitting, running, firing

class TommyVercetti {
    public void hitting() {
        System.out.println("hitting...");
    }
    public void running() {
        System.out.println("running...");
    }
    public void firing() {
        System.out.println("firing...");
    }
}

public class CWH_8_PS5 {
    public static void main(String[] args) {
        TommyVercetti tv = new TommyVercetti();
        tv.hitting();
        tv.running();
        tv.firing();
    }
}
