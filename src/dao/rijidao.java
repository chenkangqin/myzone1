package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class rijidao {
	public static List<Map<String, String>> getrijiData()throws Exception{
		List<Map<String, String>> dataList = new ArrayList<Map<String,String>>();
		
		 Connection connection = Myconnection.getConnection();
		   String sql = "select text,date_format(end_date,'%Y-%m-%d %H:%i:%s') from riji  order by end_date desc limit 10";
		   PreparedStatement pStatement = connection.prepareStatement(sql);
		   ResultSet  rs= pStatement.executeQuery(sql);
		   while (rs.next()) {
			   Map<String, String> dataMap = new HashMap<String, String>();
			   dataMap.put("rijitext", rs.getString(1));
			dataMap.put("time", rs.getString(2));
			
			dataList.add(dataMap);
	}
	Myconnection.closeConnection(connection);
	return dataList;
	}
	public static int setrijiData(String rijiString,String enddate) throws Exception{
		Connection connection = Myconnection.getConnection();
		   String sql = "insert into riji(text,end_date) values('"+rijiString+"',str_to_date('"+enddate+"', '%Y-%m-%d %H:%i:%s'))";
		   PreparedStatement pStatement = connection.prepareStatement(sql);
		   int a= pStatement.executeUpdate();
		return a;
	}
}
