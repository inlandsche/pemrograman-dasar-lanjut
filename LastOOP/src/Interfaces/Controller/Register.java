package Interfaces.Controller;

import Interfaces.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;

public class Register {

    @FXML
    private TextField nama;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;




    public void userRegister(ActionEvent event) throws IOException {
        if (regist()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Information");
            alert.setHeaderText("");
            alert.setContentText("Registrasi Berhasil!");

            var action = alert.showAndWait();

            if (action.get() == ButtonType.OK){
                Main main = new Main();

                main.changeScene("/Interfaces/fxmlFiles/sample.fxml");
            }
        }
    }

    public boolean regist() throws IOException{
        File data = new File("src/Interfaces/Data/dataAccount.txt");
        FileWriter writer = new FileWriter(data, true);

        String save = nama.getText() + "," + username.getText() + "," + password.getText()+"\n";
        writer.write(save);

        writer.flush();
        writer.close();

        return true;
    }

    public void userLogin() throws IOException{
        Main main = new Main();

        main.changeScene("/Interfaces/fxmlFiles/sample.fxml");
    }
}
