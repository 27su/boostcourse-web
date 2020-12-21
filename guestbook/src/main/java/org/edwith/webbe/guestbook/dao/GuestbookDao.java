package org.edwith.webbe.guestbook.dao;

import org.edwith.webbe.guestbook.dto.Guestbook;
import org.edwith.webbe.guestbook.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuestbookDao {
    public List<Guestbook> getGuestbooks(){
        List<Guestbook> list = new ArrayList<>();

        // 코드를 작성하세요.
        Guestbook vo = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn = DBUtil.getConnection();
			String sql = "select * from guestbook order by id desc";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				vo = new Guestbook(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getDate(4));
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

    public void addGuestbook(Guestbook guestbook){
        // 코드를 작성하세요.
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn = DBUtil.getConnection();
			String sql = "insert into guestbook (name,content,regdate) values("
					+ "?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, guestbook.getName());
			ps.setString(2, guestbook.getContent());
			ps.setObject(3, guestbook.getRegdate());
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
    }
}
