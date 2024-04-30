  
public class Main {

	public static void main(String[] args) {
		
		Contributor cb = new Contributor();
		
		cb.setName(" Ion Popescu");
		cb.setCnp("1234567890123");
		
		Property building1 =  new Property("Strada V Parvan Nr. 2",20,1000);
		Property land1 =  new Property("Strada V Parvan Nr. 2",20,3500);
		Property building2 =  new Property("Strada Lugoj Nr. 4",25,12500);
		
		cb.addProperty(building1);
        cb.addProperty(land1);
        cb.addProperty (building2);
        
        cb.displayFluturas();
		

	}

}
