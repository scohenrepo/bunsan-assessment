package assessment;

import assessment.utilerias.Utils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.List;

public class Main extends Application {
    //final static String FILE_PATH = "src/assessment/files/mini_map_forest.txt"; //resultado debe ser 7
    final static String FILE_PATH = "src/assessment/files/map_forest.txt";
    final static int GO_RIGHT = 3; //SOBRE X AVANZO 3
    final static int GO_DOWN = 1;  //SOBRE Y AVANZO 1

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        List<String> rows = Utils.readFileStream(FILE_PATH);

        Trayectory trayectory = new Trayectory();

        int treesFound = trayectory.countTrees(rows, GO_RIGHT, GO_DOWN);

        System.out.println(treesFound);
    }
}
