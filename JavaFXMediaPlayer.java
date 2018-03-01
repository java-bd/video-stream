
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class JavaFXMediaPlayer extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Group root = new Group();

        String ytMedia720 = "http://localhost/media.mp4";

        Media media = new Media(ytMedia720);
        MediaPlayer mPlayer = new MediaPlayer(media);

        mPlayer.play();
        mPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        
        mPlayer.setRate(1.8);

        MediaView mView = new MediaView(mPlayer);

        int width = (int) mView.getFitWidth();
        int height = (int) mView.getFitHeight();

        Scene scene = new Scene(root);
        primaryStage.setWidth(width);
        primaryStage.setHeight(height);

        mView.setFitWidth(width);
        mView.setFitWidth(height);

        primaryStage.setScene(scene);

        ((Group) scene.getRoot()).getChildren().add(mView);

        primaryStage.setTitle("Media Player");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
