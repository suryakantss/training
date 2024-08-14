
public class Product {
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cateory=" + cateory + ", price=" + price + "]";
	}

	private int id;
	private String name;
	private String cateory;
	private double price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCateory() {
		return cateory;
	}

	public void setCateory(String cateory) {
		this.cateory = cateory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}