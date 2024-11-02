package Adapter.Adapter_class;

public class Main {
    public static void main(String[] args) {
        abstclassPrint p = new PrintBanner("Hello");

        p.printWeek();
        p.printStrong();
    }
}
