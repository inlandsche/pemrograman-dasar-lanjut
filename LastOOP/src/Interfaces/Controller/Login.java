package Interfaces.Controller;

import Interfaces.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Login {

    @FXML
    private Button button;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label statusLogin;
    @FXML
    private Hyperlink register;


    public void userLogin(ActionEvent event) throws IOException {
        check();

        if (check()){

        }

    }

    public void userRegister(ActionEvent event) throws IOException{
        Main main = new Main();

        main.changeScene("/Interfaces/fxmlFiles/Register.fxml");
    }

    public boolean check() throws IOException{
        File data = new File("src/Interfaces/Data/dataAccount.txt");
        BufferedReader readFile = new BufferedReader(new FileReader(data));

        String load = readFile.readLine();

        while (load != null){
            StringTokenizer st = new StringTokenizer(load, ",");

            String nama = st.nextToken();
            String user = st.nextToken();
            String pass = st.nextToken();

            if (username.getText().equals(user) && password.getText().equals(pass)){
                statusLogin.setText("Login Success!");
                return true;
            }

            else {
                statusLogin.setText("Username atau Password Anda Salah!");
            }

            load = readFile.readLine();
        }

        readFile.close();
        return true;
    }

}
