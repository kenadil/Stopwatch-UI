import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Task8 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ClockPane clock = new ClockPane();
        clock.start();

        Button start = new Button("Start");
        start.setOnAction(e -> clock.start());
        Button stop = new Button("Stop");
        stop.setOnAction(e -> clock.stop());

        HBox hbox = new HBox(start, stop);
		hbox.setSpacing(5);
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.setAlignment(Pos.CENTER);
        BorderPane borderPane = new BorderPane(clock, null, null, hbox, null);

        primaryStage.setScene(new Scene(borderPane));
        primaryStage.setTitle("DisplayClock(Task 8)");
        primaryStage.show();
    }
}