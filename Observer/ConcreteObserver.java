package Observer;

public class ConcreteObserver implements Observer{
    
    @Override
    public void update(NumberGenerator generator){
        System.out.println("ConcreteObserver:");
        int count = generator.getNumber();
        for(int i=0;i<count;i++){
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){
        }
    }
}
