package kr.or.connect.reservation.dto;

public class ReservationInfoPrice {
	private int id;
	private int reservation_info_id;
	private int product_price_id;
	private int count;
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
	public int getProduct_price_id() {
		return product_price_id;
	}
	public void setProduct_price_id(int product_price_id) {
		this.product_price_id = product_price_id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Category [id=" + id + ", reservation_info_id=" + reservation_info_id +", product_price_id=" + product_price_id +", count=" + count + "]";
	}
	
}
