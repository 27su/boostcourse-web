package kr.or.connect.guestbooks.dao;

public class GuestbookDaoSqls {
	public static final String SELECT_PAGING = "SELECT id, name, content, regdate FROM guestbooks ORDER BY id DESC limit :start, :limit";
	public static final String DELETE_BY_ID = "DELETE FROM guestbooks WHERE id = :id";
	public static final String SELECT_COUNT = "SELECT count(*) FROM guestbooks";
}
