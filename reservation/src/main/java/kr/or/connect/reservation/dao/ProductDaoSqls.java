package kr.or.connect.reservation.dao;

public class ProductDaoSqls {
	public static final String SELECT_PAGING = "SELECT * FROM product ORDER BY id DESC limit :start, :limit";
	public static final String DELETE_BY_ID = "DELETE FROM product WHERE id = :id";
	public static final String SELECT_COUNT = "SELECT count(*) FROM product";
}
