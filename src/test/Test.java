package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import tool.rijinotice;
import tool.sendMailTest;

import com.mysql.jdbc.log.Slf4JLogger;

import dao.Myconnection;
import dao.rijidao;
import dao.shuodao;

public class Test {
   @org.junit.Test
   public void test1()throws Exception{
	   sendMailTest.sendMail("18813290431@163.com", "title", "maintext");
		
	}
	   
   }

