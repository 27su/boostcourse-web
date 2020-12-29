package kr.or.connect.reservation.dto;

import java.util.Date;

public class ReservationInfo {
	private int id;
	private int product_id;
	private int display_info_id;
	private int user_id;
	private Date reservation_date;
	private int cancel_flag;
	private Date create_date;
	private Date modify_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getDisplay_info_id() {
		return display_info_id;
	}
	public void setDisplay_info_id(int display_info_id) {
		this.display_info_id = display_info_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Date getReservation_date() {
		return reservation_date;
	}
	public void setReservation_date(Date reservation_date) {
		this.reservation_date = reservation_date;
	}
	public int getCancel_flag() {
		return cancel_flag;
	}
	public void setCancel_flag(int cancel_flag) {
		this.cancel_flag = cancel_flag;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getModify_date() {
		return modify_date;
	}
	public void setModify_date(Date modify_date) {
		this.modify_date = modify_date;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ReservationInfo [id=" + id + ", product_id=" + product_id + ", display_info_id=" + display_info_id +", user_id=" + user_id +", reservation_date=" + reservation_date +", cancel_flag=" + cancel_flag +", create_date=" + create_date +", modify_date=" + modify_date + "]";
	}
	
}
