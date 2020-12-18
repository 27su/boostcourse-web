package org.edwith.webbe.cardmanager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.edwith.webbe.cardmanager.dto.BusinessCard;

import java.sql.*;

public class BusinessCardManagerDao {
    public List<BusinessCard> searchBusinessCard(String keyword){
	// 구현하세요.
    	
    	List<BusinessCard> list = new ArrayList<>();
    	BusinessCard vo = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
    	String dburl  = "jdbc:mysql://localhost:3306/connectdb?serverTimezone=Asia/Seoul&useSSL=false";
    	String user = "connectuser";
    	String password = "connect123!@#";
    	
		try{
			Class.forName( "com.mysql.cj.jdbc.Driver" );
			conn =  DriverManager.getConnection ( dburl, user, password );
			String sql = "select name,phone,companyname from card where name LIKE concat ('%', ?, '%')";
			ps = conn.prepareStatement(sql);
			ps.setString(1, keyword);
			rs = ps.executeQuery();
			while(rs.next()){
				vo = new BusinessCard(rs.getString(1),rs.getString(2),rs.getString(3));
				list.add(vo);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {e.printStackTrace(); }
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {e.printStackTrace();}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {e.printStackTrace();}
			}
		}		
		return list;		
    }

    public BusinessCard addBusinessCard(BusinessCard businessCard){
	// 구현하세요.
    	
		Connection conn = null;
		PreparedStatement ps = null;
		
    	String dburl  = "jdbc:mysql://localhost:3306/connectdb?serverTimezone=Asia/Seoul&useSSL=false";
    	String user = "connectuser";
    	String password = "connect123!@#";
    	
		try{
			Class.forName( "com.mysql.cj.jdbc.Driver" );
			conn =  DriverManager.getConnection ( dburl, user, password );
			String sql = "insert into card (name,phone,companyname,carddate) values("
					+ "?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, businessCard.getName());
			ps.setString(2, businessCard.getPhone());
			ps.setString(3, businessCard.getCompanyName());
			ps.setObject(4, businessCard.getCreateDate());
			ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {e.printStackTrace(); }
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {e.printStackTrace();}
			}
		}
		
		return businessCard;
    	
    }
}
