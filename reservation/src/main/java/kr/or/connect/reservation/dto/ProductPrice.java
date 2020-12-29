package kr.or.connect.reservation.dto;

import java.util.Date;

public class ProductPrice {
	private int id;
	private int product_id;
	private String price_type_name;
	private int price;
	private float discoutn_rate;
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
	public String getPrice_type_name() {
		return price_type_name;
	}
	public void setPrice_type_name(String price_type_name) {
		this.price_type_name = price_type_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getDiscoutn_rate() {
		return discoutn_rate;
	}
	public void setDiscoutn_rate(float discoutn_rate) {
		this.discoutn_rate = discoutn_rate;
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
		return "ProductPrice [id=" + id + ", product_id=" + product_id + ", price_type_name=" + price_type_name +", price=" + price +", discoutn_rate=" + discoutn_rate +", create_date=" + create_date +", modify_date=" + modify_date + "]";
	}
	
}
