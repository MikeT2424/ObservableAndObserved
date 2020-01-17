package sample;

import java.util.Observable;
import java.util.Observer;

public class PeopleObserver implements Observer {

    /*
    The Observable and Observer objects play an important role in implementing Model-View-Controller architecture in Java.
    They are typically used in a system where one object needs to notify another about the occurrences of some important changes.
    Observable is a class and Observer is an interface. They are found in the java.util package as a part of the Java
    Core Utility Framework. However, the Observable entity found in the JavaFX is an interface and is a part of the
    javafx.beans package. The basic idea is the same, yet the implementation varies. This article shall try to
    explain the concepts behind the paradigm and how they are used in Java code with simple examples.
    */

    private String name;

    public PeopleObserver() {
        super();
    }

    public PeopleObserver(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " got " +
                ((Integer) arg).intValue() + " winks");
    }

}
