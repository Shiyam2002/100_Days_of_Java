public class Blaptop_Agencey implements BlaptopAction {	
	Blaptop_Company[] model = new Blaptop_Company[5];
	public Blaptop_Agencey(Integer i, String Model, String color, Integer j, Integer k) {
		model[0] = new Blaptop_Company(2347853,"Blaptop vers","Red",35999,512);
		model[1] = new Blaptop_Company(5793237,"Blaptop modex","Green",45999,512);
		model[2] = new Blaptop_Company(9735728,"Blaptop unir","Silver",38999,512);
		model[3] = new Blaptop_Company(9444225,"Blaptop yeri","Blue",76999,512);
	}

	@Override
	public String AddnewProduct(Blaptop_Company laptop) {
		for(Integer index=0;index<model.length;index++) {
			if(model[index]==null) {
				model[index]=laptop;
			}
		}
		return "New List is been Added";
	}

	@Override
	public void Listing() {
		for(Blaptop_Company print:model) {
			System.out.println(print);
		}
	}

	@Override
	public void Update(String name) {
		
		
	}

	@Override
	public void deleting(String name) {
		for(Integer index=0;index<model.length;index++) {
			if(model[index].getModelName().equalsIgnoreCase(name)) {
				model[index]=null;
				System.out.println(model[index]+" has been removed");
				break;
			}
		}
	}

	@Override
	public void Searching(String name) {
		
		
	}

	@Override
	public void Sorting() {
		
		
	}
}