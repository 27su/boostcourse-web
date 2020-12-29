package kr.or.connect.reservation.dto;

public class ProductImage {
	private int id;
	private int product_id;
	private String type;
	private int file_id;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
		return "ProductImage [id=" + id + ", product_id=" + product_id + ", type=" + type +", file_id=" + file_id + "]";
	}
	
}
