/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loja.suplementos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import supportClasses.Brand;
import supportClasses.databaseType;

/**
 *
 * @author vinicius
 */
public class SearchBrandController extends ControllerModel {

    @FXML
    public TextField brandSearchTextField;

    @FXML
    public TableColumn<Brand, Integer> idColumn;

    @FXML
    public TableColumn<Brand, String> nameColumn;

    @FXML
    public javafx.scene.control.TableView<Brand> brandTable;

    public ObservableList<Brand> data;

    public Stage dialog;

    public SearchBrandController(Connection db) {
        super(db);
    }

    SearchBrandController(Connection connection, databaseType dbType) {
        super(connection, dbType);
    }

    public void init(Stage modal) {

        dialog = modal;

        data = FXCollections.observableArrayList();

        idColumn.setCellValueFactory(new PropertyValueFactory<Brand, Integer>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Brand, String>("name"));

        brandTable.setItems(data);

        brandSearchTextField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                if (ke.getCode().equals(KeyCode.ENTER)) {
                    Search(new ActionEvent());
                }
            }
        });
    }

    @FXML
    public void Search(ActionEvent event) {

        

        data.clear();

        String brandSearchString = null;
        try {
            brandSearchString = brandSearchTextField.getText();
        } catch (Exception e) {

        }

        if (brandSearchString == null) {
            sendAlert("Error finding Brand",
                    "No Brand name to search.", "Pick a brand name to search.", Alert.AlertType.ERROR);
        }

        switch (dbType) {
            case firebird:
                if (brandSearchString.equals("")) {
                    System.out.println("procurar todos elementos");
                    try {
                        Statement st = this.connection.createStatement();
                        ResultSet rs = st.executeQuery(
                                "select first 50 *"
                                + " FROM brands "
                        );
                        System.out.println("valores encontrados");
                        while (rs.next()) {
                            data.add(new Brand(rs.getInt("id"), rs.getString("name")));
                        }
                        rs.close();
                        st.close();

                    } catch (Exception e) {
                        System.out.println("ERROR " + e.getMessage());

                    }

                } // find a specific brand name
                else {
                    try {
                        Statement st = this.connection.createStatement();
                        ResultSet rs = st.executeQuery(
                                "select * "
                                + " FROM brands "
                                + " WHERE name = '" + brandSearchString + "'"
                        );
                        while (rs.next()) {
                            data.add(new Brand(rs.getInt("id"), rs.getString("name")));
                        }
                        rs.close();
                        st.close();
                    } catch (Exception e) {

                    }
                }
                break;
            case postgres:
                if (brandSearchString.equals("")) {
                    System.out.println("procurar todos elementos");
                    try {
                        Statement st = this.connection.createStatement();
                        ResultSet rs = st.executeQuery(
                                "select * "
                                + " FROM brands "
                                + " limit 50"
                        );
                        System.out.println("valores encontrados");
                        while (rs.next()) {
                            data.add(new Brand(rs.getInt("id"), rs.getString("name")));
                        }
                        rs.close();
                        st.close();

                    } catch (Exception e) {

                    }

                } // find a specific brand name
                else {
                    try {
                        Statement st = this.connection.createStatement();
                        ResultSet rs = st.executeQuery(
                                "select * "
                                + " FROM brands "
                                + " WHERE name = '" + brandSearchString + "'"
                        );
                        while (rs.next()) {
                            data.add(new Brand(rs.getInt("id"), rs.getString("name")));
                        }
                        rs.close();
                        st.close();
                    } catch (Exception e) {

                    }
                }
                break;
        }

        // set items        
        brandTable.setItems(data);

    }

}
