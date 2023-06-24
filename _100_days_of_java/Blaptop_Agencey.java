package SamplePack;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class Blaptop_Agencey implements BlaptopAction {	
	Blaptop_Company[] model = new Blaptop_Company[5];
	Scanner sc = new Scanner(System.in);
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
		for(Integer index=0;index<model.length;index++) {
			if(model[index].getModelName().equalsIgnoreCase(name)) {
				System.out.println(model[index]);
				System.out.println("What to Update?");{
				String update = sc.nextLine();
				switch(update) {
				case"modelName":
							System.out.println("What's the new Model Name");
							String modelName = sc.nextLine();
							model[index].setModelName(modelName);
							break;
				case"serialNo":
							System.out.println("What's the new Serial No");
							Integer serialno = sc.nextInt() ;
							model[index].setSerialno(index);
							break;
		     		}
				}
			}
		}	
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
		System.out.println("Try to fetch laptop model matching the Laptop name "+name);
		for(Integer index=0;index<model.length;index++) {
			if(model[index].getModelName().equalsIgnoreCase(name)) {
				System.out.println(model[index]);
			}
			else {
				System.out.println("The Laptop Name you entered doesn't exist");
			}
		}	
	}

	@Override
	public void Sorting() {
		Blaptop_Company temp=null;
		System.out.println("In What terms to sort?");
		String sort = sc.nextLine();
		for(Integer index=0;index<model.length;index++) {
			for(Integer jindex=index+1;jindex<model.length;jindex++) {
				if(sort.equalsIgnoreCase("modelName ")) {
					if(model[index].getModelName().compareTo(model[jindex].getModelName())>0) {
						temp=model[index];
						model[index]=model[jindex];
						model[jindex]=temp;
					}
				}
				else if(sort.equalsIgnoreCase("serialNo")) {
					if(model[index].getSerialno().compareTo(model[jindex].getSerialno())>0) {
						temp=model[index];
						model[index]=model[jindex];
						model[jindex]=temp;
					}
				}
			}
		}
	}
}