package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField x1;
    @FXML
    private TextField x2;
    @FXML
    private TextField y1;
    @FXML
    private TextField y2;
    @FXML
    private Label finalResult;

    //action for calculate button
    public void calculateBtn(ActionEvent e){

        //getting the values from the textfields
        float x1value = Float.parseFloat(x1.getText());
        float x2value = Float.parseFloat(x2.getText());
        float y1value = Float.parseFloat(y1.getText());
        float y2value = Float.parseFloat(y2.getText());

        double subOfX = x2value - x1value;
        double subOfY = y2value - y1value;

        double squareOfX = subOfX*subOfX;
        double squareOfY = subOfY*subOfY;

        double tempResult = squareOfX + squareOfY;

        double result = Math.sqrt(tempResult);

        finalResult.setText(String.valueOf(result));

    }

    //action for reset button
    public void resetBtn(ActionEvent e){
        x1.setText("");
        x2.setText("");
        y1.setText("");
        y2.setText("");
    }
}
