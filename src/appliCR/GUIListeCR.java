package appliCR;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class GUIListeCR extends JFrame {
	
	

    public GUIListeCR() {
       
 
        this.setTitle("Liste des Comptes-Rendus");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        Object[][] donnees = {
                {"","","","","","", "", ""},
                {"","","","","","", "", ""},
                {"","","","","","", "", ""},
                {"","","","","","", "", ""},
                {"","","","","","", "", ""},
                {"","","","","","", "", ""},
                {"","","","","","", "", ""},
        };
 
        String[] colonnes = {"Nom Praticien", "Prénom Praticien", "Ville", "Date Visite", "Date Rédaction", "Bilan"};
        
 
        JTable tableau = new JTable(donnees, colonnes);
 
        this.getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
        this.getContentPane().add(tableau, BorderLayout.CENTER);
 
        this.setVisible(true);
        pack();
    }
 
}
