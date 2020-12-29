package kr.or.connect.reservation.dao;

public class CategoryDaoSqls {
	public static final String SELECT_PAGING = "SELECT * FROM category ORDER BY id DESC limit :start, :limit";
	public static final String DELETE_BY_ID = "DELETE FROM category WHERE id = :id";
	public static final String SELECT_COUNT = "SELECT count(*) FROM category";
}
