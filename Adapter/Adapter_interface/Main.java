package Adapter.Adapter_interface;

public class Main {
    public static void main(String[] args) {
        interfacePrint p = new PrintBanner("Hello");

        p.printWeek();
        p.printStrong();
    }
}
