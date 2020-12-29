package kr.or.connect.reservation.dao;

public class UserDaoSqls {
	public static final String SELECT_PAGING = "SELECT * FROM user ORDER BY id DESC limit :start, :limit";
	public static final String DELETE_BY_ID = "DELETE FROM user WHERE id = :id";
	public static final String SELECT_COUNT = "SELECT count(*) FROM user";
}
