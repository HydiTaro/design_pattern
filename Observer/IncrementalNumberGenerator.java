package Observer;

public class IncrementalNumberGenerator extends NumberGenerator{

    int start;
    int fin;
    int addedNum;
    int number;

    public IncrementalNumberGenerator(int start, int fin, int addedNum){
        this.start = start;
        this.fin = fin;
        this.addedNum = addedNum;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for(int i=0; i<(fin-start)/addedNum ; i++) {
            number = start+addedNum*i;
            notifyObservers();
        }
    }
    
}
