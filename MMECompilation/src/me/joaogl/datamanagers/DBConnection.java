package me.joaogl.datamanagers;

/*import java.sql.DriverManager;*/
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class DBConnection {

	public static Connection conn = null;
	// public static String url =
	// "jdbc:mysql://localhost:13306/MineApp?user=MasterMineApp&password=52jahH6asd88Aloq69z";
	public static String url = "jdbc:mysql://176.28.53.39:13306/MineApp?user=MasterMineApp&password=52jahH6asd88Aloq69z";
	public static String xt;
	public static Statement st;
/*
	public static void Connect(){
		tr{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = (Connection) DriverManager.getConnection(url);
			st =conn.createStatement();
			xt = "INSERT INTO";
			st.execute(xt);			
		}catch(SQLException e){
			
		}
	}*/
}
