/*
package QUIZ.quiz0206;

// Quiz 2-6 문제 9
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonApp extends Application {
    @Override
    public void start(Stage stage) {
        Button btn = new Button("클릭하세요");
        btn.setOnAction(e -> System.out.println("버튼이 클릭되었습니다!"));

        StackPane root = new StackPane(btn);
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("JavaFX 버튼 예제");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
CLI 컴파일 및 실행 명령어 예시:

javac --module-path $PATH_TO_FX --add-modules javafx.controls ButtonApp.java

java --module-path $PATH_TO_FX --add-modules javafx.controls QUIZ.quiz0206.ButtonApp
*/
