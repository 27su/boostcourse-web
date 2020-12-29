package kr.or.connect.reservation.dao;

public class DisplayInfoImageDaoSqls {
	public static final String SELECT_PAGING = "SELECT * FROM display_info_image ORDER BY id DESC limit :start, :limit";
	public static final String DELETE_BY_ID = "DELETE FROM display_info_image WHERE id = :id";
	public static final String SELECT_COUNT = "SELECT count(*) FROM display_info_image";
}
