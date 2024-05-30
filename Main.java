package latihanhewan;

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();  
        Hewan kucing = new Kucing();  
        Hewan anjing = new Anjing();
        Hewan kambing = new Kambing();

        hewan.suara();
        System.out.print("Kucing \t=");
        kucing.suara();
        System.out.print("Anjing \t=");
        anjing.suara();
        System.out.print("Kambing =");
        kambing.suara();
    }
}
