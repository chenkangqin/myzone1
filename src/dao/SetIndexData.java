package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetIndexData {
	public static List<Map<String, String>> getMainData()throws Exception{
		List<Map<String, String>> dataList = new ArrayList<Map<String,String>>();
		
		 Connection connection = Myconnection.getConnection();
		   String sql = "select * from main  order by update_time desc limit 10";
		   PreparedStatement pStatement = connection.prepareStatement(sql);
		   ResultSet  rs= pStatement.executeQuery(sql);
		   while (rs.next()) {
			   Map<String, String> dataMap = new HashMap<String, String>();
			   dataMap.put("index", rs.getString(1));
			dataMap.put("title", rs.getString(2));
			dataMap.put("maintext", rs.getString(3));
			dataMap.put("updatetime", rs.getString(4));
			dataMap.put("name", rs.getString(5));
			dataMap.put("type", rs.getString(6));
			dataList.add(dataMap);
	}
	Myconnection.closeConnection(connection);
	return dataList;
	}
		
}
