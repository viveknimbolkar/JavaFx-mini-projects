//designed and developed by VIVEK NIMBOLKAR
package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable{

    @FXML
    private ComboBox<String> comb;
    @FXML
    private TextField firstInput, secondInput;

    ObservableList<String> list = FXCollections.observableArrayList("Convert to Celcius","Convert to Farenhide");

    public void initialize(URL url, ResourceBundle resource){
        comb.setItems(list);
    }


    public void calculate(){

        String selection = comb.getSelectionModel().getSelectedItem();

        //convert the temp. into degree celcius
        if (selection.equals("Convert to Celcius")){

            String valueOne = firstInput.getText();

            float convertValueOne = Float.parseFloat(valueOne);

            float result = (convertValueOne - 32) / 1.8f;

            secondInput.setText(String.valueOf(result));


        }else if (selection.equals("Convert to Farenhide")){    //convert the temp. into faranhide to degree celcius

            String valueTwo = secondInput.getText();

            float convertValueTwo = Float.parseFloat(valueTwo);

            float resultTwo = (convertValueTwo * 1.8f) + 32;

            firstInput.setText(String.valueOf(resultTwo));
        }

    }

    public void resetBtn(){
        firstInput.setText("");
        secondInput.setText("");
    }


}
