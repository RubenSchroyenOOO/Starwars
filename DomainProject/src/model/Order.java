package model;
public class Order {
	int quantity;
	private Product product;
	
	public Order(int quantity, Product product){
		setQuantity(quantity);
		setProduct(product);
	}

	private void setProduct(Product product) {
		this.product=product;
	}

	private void setQuantity(int quantity) {
		if(quantity < 1){
			throw new IllegalArgumentException("Quantity must be higher than 0.");
		}
		this.quantity=quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}
	
	public double getPrice(){
		return product.getPrice()*this.getQuantity();
	}
}
