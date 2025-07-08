/*package QUIZ.quiz0206;

// Quiz 2-6 문제 10
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SimpleJavaFXApp extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello, JavaFX!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 300, 150);

        stage.setTitle("JavaFX 기본 예제");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
CLI 컴파일 및 실행 명령어 예시:

javac --module-path $PATH_TO_FX --add-modules javafx.controls SimpleJavaFXApp.java

java --module-path $PATH_TO_FX --add-modules javafx.controls QUIZ.quiz0206.SimpleJavaFXApp
*/
