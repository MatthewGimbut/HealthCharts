package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class FileSelectController {

    public static String FILE_SELECT_FXML = "gui\\FileSelect.fxml";

    public FileSelectController() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource(FILE_SELECT_FXML));
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (Exception exception) {

            System.out.println("Failed");
            System.out.println(exception.getMessage());
        }
    }

    @FXML
    void initialize() {

    }
}

