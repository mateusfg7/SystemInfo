/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infosystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Mateus
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label operationsystem;

    @FXML
    private Label language;
    
    @FXML
    private Label usuario;
    
    @FXML
    private Label ram;
    
    @FXML
    private Label res;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        // pegar infos do sistema: System.getProperty();
        
        
        
        System.out.println("- L O G -"); //log titulo
        
        //sistema operacional
        System.out.println("Pegando informações do sistema operacional...");//log
        operationsystem.setText(System.getProperty("os.name") + " versão " + System.getProperty("os.version"));
        
        //linguagem
        System.out.println("Pegando o idioma do sistema...");//log
        Locale lang = Locale.getDefault();
        language.setText(lang.getDisplayLanguage());
        
        //usuário
        System.out.println("Pegando informações do usuário...");//log
        usuario.setText(System.getProperty("user.name") + " ( " + System.getProperty("user.home")+ " )");
        
        //video
        System.out.println("Pegando informações de video...");//log
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        res.setText(d.width + " x " + d.height);
        
        
        
        
        
        
        
    }    
    
}
