package appliCR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnexionBDD  {
	
	private static Connection connexion = null;
	private static Statement stmt = null ;
	private static ResultSet resultat ;
	private static String driver ="com.mysql.jdbc.Driver";
	private static String requete;
	public ConnexionBDD() throws SQLException, ClassNotFoundException{
		String url = "jdbc:mysql://localhost/GsbCRSlam";
		String user ="root";
		String password = "mysql";
			
		
		try{
			requete = "SELECT VISITEUR.VIS_MATRICULE, VISITEUR.VIS_MDP " +
					  "FROM VISITEUR, TRAVAILLER " +
					  "WHERE VISITEUR.VIS_MATRICULE = TRAVAILLER.VIS_MATRICULE " +
					  "AND TRA_ROLE='Délégué' AND TRAVAILLER.VIS_MATRICULE=? AND VIS_MDP=?;";
			Class.forName(driver);
			System.out.println("Chargement OK");
			connexion = DriverManager.getConnection(url,user,password);
			 stmt = connexion.createStatement();
			 resultat = stmt.executeQuery(requete);
	
			 
			 while(resultat.next()){
				 System.out.println(resultat.getString("VIS_NOM"));
				
			 }
			 
			
		}
		catch(SQLException e){
			System.out.println("a "+ e.getMessage());
			
		}
	}
//	public getConnexion() {
//		
//	}
//	public static void main(String[] args)throws SQLException, ClassNotFoundException{
//		ConnexionBDD connection = new ConnexionBDD();
//	
//	}

}

