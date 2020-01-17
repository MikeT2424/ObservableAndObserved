package sample;

import java.util.Observable;


    /*
    A class that wants to be observed or the class that extends Observable must call the setChanged() method
    if it has changed and must trigger notification by calling the notifyObservers() method.
    This in turn calls the update() method of the observer class. If, however, an object calls the notifyObserver()
    method without calling the setChanged() method, no action takes place.
    Therefore, an observable object must call the setChange() method prior to calling the notifyObservers()
    method on the event of any change. This order would subsequently call the update()
    method of the observer classes seamlessly.
    */


public class PeopleObservable extends Observable {

    private String name;

    public PeopleObservable() {
        super();
    }

    public PeopleObservable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    Any Java class interested in being observable extends the Observable class.
    The extended class then can be observed by other interested classes in other parts of the program.
    The registered classes are notified as soon as any change is triggered in the observable class to which
    the observer class is registered to. This is the relation between the Observable and Observer classes.
    Observer classes are nothing but the implementation of the Observer interface.
    The Observer interface provides an update() method that is called when an observer
    is notified of a change in the observed object.
    */

    void wink(int count) {
        setChanged();
        notifyObservers(count);
    }
}
