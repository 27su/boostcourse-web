package kr.or.connect.reservation.dao;

public class PromotionDaoSqls {
	public static final String SELECT_PAGING = "SELECT * FROM promotion ORDER BY id DESC limit :start, :limit";
	public static final String DELETE_BY_ID = "DELETE FROM promotion WHERE id = :id";
	public static final String SELECT_COUNT = "SELECT count(*) FROM promotion";
}
