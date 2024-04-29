package MyPackage;
import MyPackage.MyObserver;
public interface MySubject {
    public void attach(MyObserver o);

    public void detach(MyObserver o);

    public void notifyObserver();
}
