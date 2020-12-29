package kr.or.connect.reservation.dao;

public class FileInfoDaoSqls {
	public static final String SELECT_PAGING = "SELECT * FROM file_info ORDER BY id DESC limit :start, :limit";
	public static final String DELETE_BY_ID = "DELETE FROM file_info WHERE id = :id";
	public static final String SELECT_COUNT = "SELECT count(*) FROM file_info";
}
