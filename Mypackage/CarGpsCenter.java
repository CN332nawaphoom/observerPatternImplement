package MyPackage;
import java.util.ArrayList;
import java.util.List;

public class CarGpsCenter {
    private List<MyObserver> monitors = new ArrayList<MyObserver>();
    // private List<CarLocation> carLocation = new ArrayList<CarLocation>() 

    /* --------------------- for "subject" of "monitor observer" --------------------- */
    public void attach(MyObserver monitor){
        monitors.add(monitor);
    }

    public void detach(MyObserver monitor){
        monitors.remove(monitor);

    }

    public void notifyObserver(){
        for (MyObserver monitor : monitors) {
            monitor.update();
        }
    }
    /* -------------------------------------------------------------------------- */

    /* ------------------- for "observer" of "car gps subject" ------------------ */
    public void update(){
        updateLocation();
    }

    public void updateLocation(){
        // List<CarLocation> carLocation = newCarLocation; 
    }

    
}

