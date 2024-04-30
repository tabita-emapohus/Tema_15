import java.util.ArrayList;
import java.util.List;

public class Contributor {

	private String name;
	private String cnp;
	private List<Property> properties;
	
		/*public Contributor() {
		this.name = name;
		this.cnp = cnp;
	}*/
	
	public Contributor() {
        this.properties = new ArrayList<>();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public void addProperty(Property property) {
        properties.add(property);
	}
	
	public void displayFluturas() {
		
		System.out.println("Contributor: " + this.name);
        System.out.println("Proprietati:");
        for (Property property : properties) {
            System.out.println(property.displayInformation());
        }
        double sumaTotala = 0;
        for (Property property : properties) {
            sumaTotala += property.getCost();           
        }
        System.out.println("Suma totala: " + sumaTotala);
      
	}
}
