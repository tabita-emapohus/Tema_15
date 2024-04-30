
public class Property {

	private String address;
	private double surface;
	private double cost;

	public Property(String address, double surface, double cost) {
		this.address = address;
		this.surface = surface;
		this.cost = cost;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	public String displayInformation () {
	    return String.format("Address: %s\nArea: %.2f\nCost: %.2f ", address, surface, cost);
	}
}
