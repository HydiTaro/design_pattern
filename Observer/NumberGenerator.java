package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    
    private List<Observer> observers = new ArrayList<>();

    //Observerの追加
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    
    // Observerの削除
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    // Observerへ通知する
    public void notifyObservers(){
        for(Observer o: observers){
            o.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}
