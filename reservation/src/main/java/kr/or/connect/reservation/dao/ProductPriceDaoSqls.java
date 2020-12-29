package kr.or.connect.reservation.dao;

public class ProductPriceDaoSqls {
	public static final String SELECT_PAGING = "SELECT * FROM product_price ORDER BY id DESC limit :start, :limit";
	public static final String DELETE_BY_ID = "DELETE FROM product_price WHERE id = :id";
	public static final String SELECT_COUNT = "SELECT count(*) FROM product_price";
}
