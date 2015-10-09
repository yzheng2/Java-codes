package com.imooc.dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.imooc.db.DBUtil;
import com.imooc.model.Goddess;

public class GoddessDao {
	
	public void addGoddess(){
		Connection conn = DBUtil.getConnection();
	}
	
	public void updateGoddess(){
		
	}
	
	public void delGoddess(){
		
	}
	
	public ArrayList<Goddess> query() throws Exception{
		Connection conn = DBUtil.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select user_name,age from imooc_goddess");
		
		ArrayList<Goddess> gs = new ArrayList<Goddess>();
		Goddess g = null;
		while(rs.next()){
			g = new Goddess();
			g.setUser_name(rs.getString("user_name"));
			g.setAge(rs.getInt("age"));
			
			gs.add(g);
			
		}
		return gs;
	}
	
	public Goddess get(){
		return null;
	}
	
	
}
