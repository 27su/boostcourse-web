package kr.or.connect.reservation.dto;

public class ReservationUserCommentImage {
	private int id;
	private int reservation_info_id;
	private int reservation_user_comment_id;
	private int file_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReservation_info_id() {
		return reservation_info_id;
	}
	public void setReservation_info_id(int reservation_info_id) {
		this.reservation_info_id = reservation_info_id;
	}
	public int getReservation_user_comment_id() {
		return reservation_user_comment_id;
	}
	public void setReservation_user_comment_id(int reservation_user_comment_id) {
		this.reservation_user_comment_id = reservation_user_comment_id;
	}
	public int getFile_id() {
		return file_id;
	}
	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ReservationUserCommentImage [id=" + id + ", reservation_info_id=" + reservation_info_id +", reservation_user_comment_id=" + reservation_user_comment_id +", file_id=" + file_id + "]";
	}
	
}
