import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import static java.lang.Integer.valueOf;


public class Controller extends Main {
    @FXML
    public PasswordField C1 ;
    @FXML
    public PasswordField C2;
    @FXML
    public PasswordField sent1;
    @FXML
    public TextField sent2;
    @FXML
    public PasswordField change1;
    @FXML
    public PasswordField change2;
    public  static int id;
    private getcash screen1 = new getcash();
    private ChangePass screen2 = new ChangePass();
    private SentMoney screen3 = new SentMoney();

    user user1 = new user();
    @FXML
    public TextField get1;

    public void Sign(ActionEvent actionEvent) throws Exception {
        id = valueOf(C1.getText());
        StackPane secondaryLayout = new StackPane();

        Scene secondScene = new Scene(secondaryLayout, 230, 100);
        Stage newWindow = new Stage();
        newWindow.setTitle("Second Stage");
        newWindow.setScene(secondScene);

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("INCORRECT ID OR PASS");
        if (C1.getText().equals("") || C2.getText().equals("")) alert.showAndWait();
        if (user1.checkpass(valueOf(C2.getText()),valueOf(C1.getText()))) {stage.close();
            start1(newWindow);}
        else alert.showAndWait();
    }

    public void showcash(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("YOUR CASH IS");
        int cash = user1.getfromdatabasecash(id);
        String b="";
        b+=cash;
        alert.setContentText(b);
        alert.showAndWait();
    }

    public void getcash(ActionEvent actionEvent) throws Exception {
        StackPane getcash1 = new StackPane();
        Scene newscene = new Scene(getcash1,250,250);
        Stage seecondwindow = new Stage();
        seecondwindow.setScene(newscene);
        start2(seecondwindow);
    }

    public void getthiscash(ActionEvent actionEvent) throws CloneNotSupportedException {
        Alert alert1 = new Alert(Alert.AlertType.ERROR);
        alert1.setContentText("incorrect sum. please try again");
        if (valueOf(get1.getText())>user1.cash){
            Alert alert12 = new Alert(Alert.AlertType.ERROR);
            alert12.setContentText("U have no enough money");
            alert12.showAndWait();
        } else {
        if (valueOf(get1.getText())<0 || get1.getText().equals("")) alert1.showAndWait();
         else {
            screen1.updatebalance(id,screen1.getCash(user1.getfromdatabasecash(id),valueOf(get1.getText())));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("operation done successfully");
            alert.showAndWait();
            stage2.close();
            }
        }
    }

    public void sentmoney(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Please, input ID and SUM");
        if (valueOf(sent2.getText())>user1.cash){
            Alert alert12 = new Alert(Alert.AlertType.ERROR);
            alert12.setContentText("U have no enough money");
            alert12.showAndWait();
        } else {
        if (sent2.getText().equals("") || sent1.getText().equals("")) alert.showAndWait();
        else {
         Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
         alert1.setContentText("operation done successfully");
         alert1.showAndWait();
         screen3.sentmoney(valueOf(sent2.getText()),id,valueOf(sent1.getText()));
        stage3.close();
            }
        }
    }

    public void OPsentmoney(ActionEvent actionEvent) throws Exception {
        StackPane sentmoney1 = new StackPane();
        Scene newscene = new Scene(sentmoney1,250,250);
        Stage thirdwindow = new Stage();
        thirdwindow.setScene(newscene);
        start3(thirdwindow);
    }

    public void OPchangepass(ActionEvent actionEvent) throws Exception {
        StackPane changepass1 = new StackPane();
        Scene newscene = new Scene(changepass1,250,250);
        Stage forthwindow = new Stage();
        forthwindow.setScene(newscene);
        start4(forthwindow);
    }

    public void changepass(ActionEvent actionEvent) {
            if (valueOf(change1.getText()) == user1.getfromdatabasepin(id)){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("operation done successfully");
            alert.showAndWait();
            screen2.updatepin(id,valueOf(change2.getText()));
            stage4.close();
            } else {
                Alert alert1  = new Alert(Alert.AlertType.ERROR);
                alert1.setContentText("INCORRECT PIN");
                alert1.showAndWait();
            }
        }

    public void BB(ActionEvent actionEvent) {
            stage1.close();
    }
}
