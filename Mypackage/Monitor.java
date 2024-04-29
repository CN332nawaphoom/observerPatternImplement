package MyPackage;
import MyPackage.MyObserver;

public class Monitor implements MyObserver{
    public void update(){
        updateScreen();
    }

    private void updateScreen(){}
}
