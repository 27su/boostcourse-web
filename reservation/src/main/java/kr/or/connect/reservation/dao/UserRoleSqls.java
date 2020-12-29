package kr.or.connect.reservation.dao;

public class UserRoleSqls {
	public static final String SELECT_PAGING = "SELECT * FROM user_role ORDER BY id DESC limit :start, :limit";
	public static final String DELETE_BY_ID = "DELETE FROM user_role WHERE id = :id";
	public static final String SELECT_COUNT = "SELECT count(*) FROM user_role";
}
