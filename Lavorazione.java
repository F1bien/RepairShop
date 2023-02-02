
public class Lavorazione {
	
	private String desc; 
	private double price; 
	
	
	public Lavorazione(String desc, double price) {
		
		this.desc = desc; 
		this.price = price; 
		
	}
	
//	----set----
	
	
	public void set_price(double price) {
		this.price = price;  
	}
	public void set_desc(String desc) {
		this.desc = desc;  
	}

	
//	----get----
	
	
	public String get_desc() {
		return desc; 
	}
	public double get_price() {
		return price; 
	}


// ----TO-STRING----
	
	public String to_string() {
		
		return "Descrizione: " + this.desc +
				"\nPrice: " + this.price;
		
	}
	
	

}
