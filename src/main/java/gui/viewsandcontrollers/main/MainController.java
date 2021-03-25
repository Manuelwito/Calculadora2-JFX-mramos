package gui.viewsandcontrollers.main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {

	@FXML
	private Button buttonSum;
	@FXML
	private Label resultado;
	@FXML
	private TextField resultado1;
	@FXML
	private TextField textfield;
	@FXML
	private TextField textfield1;
	@FXML
	private Button buttonRes;
	@FXML
	private Button buttonMult;
	@FXML
	private Button buttonDiv;

	public void initialize() {
		// TODO
	}

	@FXML
	private void handleButtonAction(ActionEvent event) throws IOException {
		try {
			float num1 = Float.parseFloat(textfield.getText());
			float num2 = Float.parseFloat(textfield1.getText());

			resultado1.setText(String.valueOf(sumar(num1, num2)));

		} catch (Exception e) {

			Stage ventana = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("../modal/Modal.fxml"));
			Scene scene = new Scene(root);
			Label label = (Label) root.getChildrenUnmodifiable().get(0);
			label.setText("Valores erroneos, debe introducir valores de tipo numérico");
			ventana.setScene(scene);
			ventana.show();
		}
	}

	@FXML
	private void handleMultiplicarButtonAction(ActionEvent event) throws IOException {
		try {
			float num1 = Float.parseFloat(textfield.getText());
			float num2 = Float.parseFloat(textfield1.getText());

			resultado1.setText(String.valueOf(multiplicar(num1, num2)));

		} catch (Exception e) {

			Stage ventana = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("../modal/Modal.fxml"));
			Scene scene = new Scene(root);
			Label label = (Label) root.getChildrenUnmodifiable().get(0);
			label.setText("Valores erroneos, debe introducir valores de tipo numérico");
			ventana.setScene(scene);
			ventana.show();
		}
	}

	@FXML
	private void handleSumarButtonAction(ActionEvent event) throws IOException {
		try {
			float num1 = Float.parseFloat(textfield.getText());
			float num2 = Float.parseFloat(textfield1.getText());

			resultado1.setText(String.valueOf(sumar(num1, num2)));

		} catch (Exception e) {

			Stage ventana = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("../modal/Modal.fxml"));
			Scene scene = new Scene(root);
			Label label = (Label) root.getChildrenUnmodifiable().get(0);
			label.setText("Valores erroneos, debe introducir valores de tipo numérico");
			ventana.setScene(scene);
			ventana.show();
		}
	}

	@FXML
	private void handleRestarButtonAction(ActionEvent event) throws IOException {
		try {
			float num1 = Float.parseFloat(textfield.getText());
			float num2 = Float.parseFloat(textfield1.getText());

			resultado1.setText(String.valueOf(restar(num1, num2)));

		} catch (Exception e) {

			Stage ventana = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("../modal/Modal.fxml"));
			Scene scene = new Scene(root);
			Label label = (Label) root.getChildrenUnmodifiable().get(0);
			label.setText("Valores erroneos, debe introducir valores de tipo numérico");
			ventana.setScene(scene);
			ventana.show();
		}
	}

	@FXML
	private void handleDividirButtonAction(ActionEvent event) throws IOException {
		try {
			float num1 = Float.parseFloat(textfield.getText());
			float num2 = Float.parseFloat(textfield1.getText());

			resultado1.setText(String.valueOf(dividir(num1, num2)));

		} catch (Exception e) {

			Stage ventana = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("../modal/Modal.fxml"));
			Scene scene = new Scene(root);
			Label label = (Label) root.getChildrenUnmodifiable().get(0);
			label.setText("Valores erroneos, debe introducir valores de tipo numérico");
			ventana.setScene(scene);
			ventana.show();
		}
	}

	public float sumar(float a, float b) {
		return a + b;

	}

	public float restar(float a, float b) {
		return a - b;
	}

	public float multiplicar(float a, float b) {
		return a * b;
	}

	public float dividir(float a, float b) {
		return a / b;
	}

}
