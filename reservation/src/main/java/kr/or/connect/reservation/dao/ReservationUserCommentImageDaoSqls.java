package kr.or.connect.reservation.dao;

public class ReservationUserCommentImageDaoSqls {
	public static final String SELECT_PAGING = "SELECT * FROM reservation_user_comment_image ORDER BY id DESC limit :start, :limit";
	public static final String DELETE_BY_ID = "DELETE FROM reservation_user_comment_image WHERE id = :id";
	public static final String SELECT_COUNT = "SELECT count(*) FROM reservation_user_comment_image";
}
