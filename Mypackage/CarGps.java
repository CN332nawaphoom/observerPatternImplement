package MyPackage;
import java.util.ArrayList;
import java.util.List;

import MyPackage.MySubject;

public class CarGps implements MySubject {
    List<MyObserver> observers = new ArrayList<MyObserver>();

    public void attach(MyObserver o){
        observers.add(o);
    }

    public void detach(MyObserver o){
        observers.remove(o);

    }

    public void notifyObserver(){
        for (MyObserver myObserver : observers) {
            myObserver.update();
        }
    }
}
