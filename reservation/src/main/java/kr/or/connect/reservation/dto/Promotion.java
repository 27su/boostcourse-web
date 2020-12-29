package kr.or.connect.reservation.dto;

public class Promotion {
	private int id;
	private int product_id;
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Promotion [id=" + id + ", product_id=" + product_id + "]";
	}
	
}
