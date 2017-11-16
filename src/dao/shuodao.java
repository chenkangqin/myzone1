package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class shuodao {
	public static List<Map<String, String>> getShuoData()throws Exception{
		List<Map<String, String>> dataList = new ArrayList<Map<String,String>>();
		
		 Connection connection = Myconnection.getConnection();
		   String sql = "select shuoshuo,date_format(update_time,'%Y-%m-%d %H:%i:%s') from shuoshuo  order by update_time desc limit 10";
		   PreparedStatement pStatement = connection.prepareStatement(sql);
		   ResultSet  rs= pStatement.executeQuery(sql);
		   while (rs.next()) {
			   Map<String, String> dataMap = new HashMap<String, String>();
			   dataMap.put("shuotext", rs.getString(1));
			dataMap.put("time", rs.getString(2));
			
			dataList.add(dataMap);
	}
	Myconnection.closeConnection(connection);
	return dataList;
	}
	public static int setShuoData(String shuoString) throws Exception{
		Connection connection = Myconnection.getConnection();
		   String sql = "insert into shuoshuo values('"+shuoString+"',"+"sysdate())";
		   PreparedStatement pStatement = connection.prepareStatement(sql);
		   int a= pStatement.executeUpdate();
		return a;
	}
}
