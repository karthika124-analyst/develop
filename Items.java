public class Items {
	
	private int itemId;
	
	private String shortDescription;
	
	private int price;
	
	private String brand;
	
	public Items(int itemId, String shortDescription, int price, String brand) {
		super();
		this.itemId = itemId;
		this.shortDescription = shortDescription;
		this.price = price;
		this.brand = brand;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
    public String toString() {
        return "Item [id=" + itemId + ", description=" +shortDescription + ", price=" + price + ", brand=" + brand + "]";
    }

}
