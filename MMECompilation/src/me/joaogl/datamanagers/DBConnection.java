/**
 * This file is part of MMECompilation.

    MMECompilation is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    MMECompilation is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with MMECompilation.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.joaogl.datamanagers;

/*import java.sql.DriverManager;*/
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class DBConnection {

	public static Connection conn = null;
	// public static String url =
	// "jdbc:mysql://localhost:13306/MineApp?user=MasterMineApp&password=52jahH6asd88Aloq69z";
	public static String url = "jdbc:mysql://176.28.53.39:13306/MineApp?user=MasterMineApp&password=";
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
