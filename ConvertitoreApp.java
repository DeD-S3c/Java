import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ConvertitoreApp extends Application {

    @Override
    public void start(Stage primaryStage) {

        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25));

        Label titolo = new Label("Convertitore Euro → Dollari");
        titolo.setStyle("-fx-font-size: 22px; -fx-font-weight: bold; -fx-text-fill: #333333;");

        Label lblEuro = new Label("Importo in Euro (€):");
        lblEuro.setStyle("-fx-font-size: 15;");

        TextField txtEuro = new TextField();
        txtEuro.setPromptText("es. 50 o 123.45");
        txtEuro.setMaxWidth(220);
        txtEuro.setStyle("-fx-font-size: 16px; -fx-padding: 8;");

        Button btnConverti = new Button("Converti in Dollari");
        btnConverti.setStyle("-fx-font-size: 15px; -fx-padding: 10 30; -fx-background-color: #4CAF50; -fx-text-fill: white;");

        Label lblRisultato = new Label("Risultato in USD: ");
        lblRisultato.setStyle("-fx-font-size: 17px; -fx-font-weight: bold; -fx-text-fill: #006400;");

        root.getChildren().addAll(
            titolo,
            lblEuro,
            txtEuro,
            btnConverti,
            lblRisultato
        );

        Scene scene = new Scene(root, 420, 340);

        primaryStage.setTitle("Convertitore Euro / Dollari – JavaFX");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
