package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;

import java.util.Random;

public class Controller {

    @FXML
    private TextField firstField, secondField;
    @FXML
    private Label status;

    //generate the otp and send to the client
    public void generateOTP(){

        String mobileNum = firstField.getText();

        String getOTP = generateRandomNumber();

        SendSms.sendSms(tempOTP, mobileNum);
    }


    //validate the otp send to the user
    public void validateOTP(){

        String userValue = secondField.getText();

        if (userValue.equals(tempOTP)){

            status.setText("OTP Validation Successful!");

            status.setTextFill(Color.GREEN);

        }else {

            status.setText("OTP Validation Failed!");

            status.setTextFill(Color.RED);
        }
    }

    private String tempOTP = generateRandomNumber();

    //generate a random number
    public String generateRandomNumber(){

        Random r = new Random();

        int tempNumber = r.nextInt(100000);

        String conertToString = String.valueOf(tempNumber);

        return conertToString;
    }

}
