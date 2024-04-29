package MyPackage;
import java.util.ArrayList;
import java.util.List;

public class CarGps implements MySubject {
    private List<MyObserver> carGpsCenters = new ArrayList<MyObserver>();
    // private CarLocation location = sensor(); 

    public void attach(MyObserver carGpsCenter){
        carGpsCenters.add(carGpsCenter);
    }

    public void detach(MyObserver carGpsCenter){
        carGpsCenters.remove(carGpsCenter);

    }

    public void notifyObserver(){
        for (MyObserver carGpsCenter : carGpsCenters) {
            carGpsCenter.update();
            // sendLocationToCarGpsCenter(location);
        }
    }

    // private void sendLocationToCarGpsCenter(location){};
}
