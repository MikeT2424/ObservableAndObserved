package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Observable;
import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        PeopleObservable damsel = new PeopleObservable("Minnie");
        PeopleObservable dancer = new PeopleObservable("Summer");

        PeopleObserver mickey = new PeopleObserver("Mickey");

        PeopleObserver donald = new PeopleObserver("Donald");

        PeopleObserver goofy = new PeopleObserver("Goofy");

        damsel.addObserver(mickey);
        damsel.addObserver(donald);
        damsel.addObserver(goofy);

        System.out.println("There are " + damsel.countObservers()
                + " observers of "
                + damsel.getName());

        Random r = new Random();
        damsel.wink(r.nextInt(10));

        //The Observer interface provides an update() method that is called when an observer
        //is notified of a change in the observed object.
        damsel.wink(3);

        // In this case , when the above code is changed to make the damsel wink 3 times, it automatically outputs the
        // results for the 3 Observer ojects with nothing further written.



        launch(args);
    }
}
