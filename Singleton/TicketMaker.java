package Singleton;

// rensyu5-1
public class TicketMaker {

    private static TicketMaker singleton = new TicketMaker();
    private int ticket = 100;
    
    private TicketMaker(){
        // nothing
    }

    public TicketMaker getInstance(){
        return singleton;
    }

    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
}
