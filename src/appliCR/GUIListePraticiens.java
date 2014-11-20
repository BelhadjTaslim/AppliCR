package appliCR;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTable;

public class GUIListePraticiens extends JFrame {
	
	

    public GUIListePraticiens() {
       
 
        setTitle("Liste des praticiens hésitants");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Object[][] donnees = {
                {"","","","","","", "", ""},
                {"","","","","","", "", ""},
                {"","","","","","", "", ""},
                {"","","","","","", "", ""},
                {"","","","","","", "", ""},
                {"","","","","","", "", ""},
                {"","","","","","", "", ""},
        };
 
        String[] colonnes = {"Nom", "Prénom", "Adresse", "Code Postal", "Ville", "Coefficient de confiance","Coefficient de notoriété", "Temps depuis la dernière visite"};
 
        JTable tableau = new JTable(donnees, colonnes);
 
        getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
        getContentPane().add(tableau, BorderLayout.CENTER);
 
        this.setVisible(true);
        pack();
    }
 

}
