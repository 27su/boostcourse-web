package kr.or.connect.reservation.dao;

public class DisplayInfoDaoSqls {
	public static final String SELECT_PAGING = "SELECT * FROM display_info ORDER BY id DESC limit :start, :limit";
	public static final String DELETE_BY_ID = "DELETE FROM display_info WHERE id = :id";
	public static final String SELECT_COUNT = "SELECT count(*) FROM display_info";
}
