package Operatore_BOT_GUI.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Operatore_BOT_GUI.model.Azienda;
import Operatore_BOT_GUI.model.News;

public class NewsDAO {
	
public List<News> getNewsAzienda (Azienda az) {
		
		String partitaIVA = az.getPartitaIVA();
		final String sqlNewsAzienda = "SELECT * FROM news WHERE p_iva=? ;";
		ArrayList<News> listNews = new ArrayList<News>();
		try {
			Connection conn = DBConnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sqlNewsAzienda);
			st.setString(1, partitaIVA);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				News n = new News(rs.getString(1), rs.getLong(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
				listNews.add(n);
			}
			st.close();
			conn.close();
			az.setNews(listNews);
			return listNews;
		}catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Errore DB");
		}
	}

}
