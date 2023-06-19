package _100_days_of_java;

public class Blaptop_Agencey implements BlaptopAction {	
	Blaptop_Agencey[] model = new Blaptop_Agencey[5];
	public Blaptop_Agencey(Integer i, String Model, String color, Integer j, Integer k) {
		model[0] = new Blaptop_Agencey(2347853,"Blaptop vers","Red",35999,512);
		model[1] = new Blaptop_Agencey(5793237,"Blaptop modex","Green",45999,512);
		model[2] = new Blaptop_Agencey(9735728,"Blaptop unir","Silver",38999,512);
		model[3] = new Blaptop_Agencey(9444225,"Blaptop yeri","Blue",76999,512);
	}

	@Override
	public String AddnewProduct(Blaptop_Company laptop) {
		
		return null;
	}

	@Override
	public void Listing() {
		
		
	}

	@Override
	public void Update(String name) {
		
		
	}

	@Override
	public void deleting(String name) {
		
		
	}

	@Override
	public void Searching(String name) {
		
		
	}

	@Override
	public void Sorting() {
		
		
	}
}