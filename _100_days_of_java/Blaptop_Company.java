package _100_days_of_java;

public class Blaptop_Company {
	private Integer serialno;
	private String modelName;
	private String color;
	private Integer price;
	private Integer storage;
	
	@Override
	public String toString() {
		return "Blaptop_Company [serialno=" + serialno + ", modelName=" + modelName + ", color=" + color + ", price="
				+ price + ", storage=" + storage + "]";
	}
	
	public Blaptop_Company() {
		super();
	}
	
	public Blaptop_Company(Integer serialno, String modelName, String color, Integer price, Integer storage) {
		super();
		this.serialno = serialno;
		this.modelName = modelName;
		this.color = color;
		this.price = price;
		this.storage = storage;
	}

	public Integer getSerialno() {
		return serialno;
	}
	public void setSerialno(Integer serialno) {
		this.serialno = serialno;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getStorage() {
		return storage;
	}
	public void setStorage(Integer storage) {
		this.storage = storage;
	}
}