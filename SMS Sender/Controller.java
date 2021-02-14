package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField mobileNum;
    @FXML
    private TextArea textMsg;

    //send the sms
    public void sendMsg(){
        String mobileNumber = mobileNum.getText();
        String textMessage = textMsg.getText();

        SendSms.sendSms(textMessage, mobileNumber);
    }

    //reset btn
    public void resetBtn(){
        mobileNum.setText("");
        textMsg.setText("");
    }
}
