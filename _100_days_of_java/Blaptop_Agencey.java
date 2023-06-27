import java.util.Scanner;

public class Blaptop_Agencey implements BlaptopAction {	
	
	Blaptop_Company[] model = new Blaptop_Company[5];
    static Scanner sc = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
	
	public Blaptop_Agencey() {
		model[0] = new Blaptop_Company(2347853,"Blaptop vers","Red",35999,512);
		model[1] = new Blaptop_Company(5793237,"Blaptop modex","Green",45999,512);
		model[2] = new Blaptop_Company(9735728,"Blaptop unir","Silver",38999,512);
		model[3] = new Blaptop_Company(9444225,"Blaptop yeri","Blue",76999,512);
	}
	
	public static void main(String[] args) {
		Blaptop_Agencey obj = new Blaptop_Agencey();
		Integer serialno,price,storage,choice;
		String modelName,color,Name;
		do {
			System.out.println("``````````Bloptop```````````");
			System.out.println("    Operations:     ");
			System.out.println("1.Add a New Laptop Model");
			System.out.println("2.List All Laptop Model");
			System.out.println("3.Delete a Laptop Model");
			System.out.println("4.Change a Data in Laptop Model");
			System.out.println("5.Searching a Laptop");
			System.out.println("6.Sort the Data");
			System.out.println("Enter your Choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Details of the Laptop Model(Serial No,Model Name,Color,Price,Storage");
				System.out.println("Enter the Serial Number");
				serialno = sc.nextInt();
				System.out.println("Enter the Model Name");
				modelName = sc.next();
				modelName += sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the Color");
				color = sc.nextLine();
				System.out.println("Enter the Price");
				price = sc.nextInt();
				System.out.println("Enter the Storage");
				storage = sc.nextInt();
				Blaptop_Company info = new Blaptop_Company(serialno, modelName, color, price, storage);
				obj.AddnewProduct(info);
				break;
			case 2:
				obj.Listing();
				break;
			case 3:
				obj.Listing();
				System.out.println("What to Delete in the List ?");
				System.out.println("Enter the Name");
				modelName = sc.nextLine();
				obj.deleting(modelName);
				obj.Listing();
				break;
			case 4:
				obj.Listing();
				System.out.println("What do you like to Update ?(Serial number, Modle name, Color, Price, Storage)"); 
				Name = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the "+Name);
				obj.Update(Name);
				obj.Listing();
				break;
			case 5:
				System.out.println("What Laptop do you like to see");
				System.out.println("Enter the Name");
				modelName = sc.nextLine();
				obj.Searching(modelName);
				break;
			case 6:
				obj.Sorting();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: "+choice);
			}
			
		}while(choice!=0);
		sc.close();
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
				String update = in.nextLine();
				switch(update) {
				case"modelName":
							System.out.println("What's the new Model Name");
							String modelName = in.next();
							model[index].setModelName(modelName);
							break;
				case"serialNo":
							System.out.println("What's the new Serial No");
							Integer serialno = in.nextInt() ;
							model[index].setSerialno(serialno);
							break;
				case"color":
					        System.out.println("What's the new Color");
					        String color = in.next();
					        model[index].setColor(color);
					        break;
				case"price":
							System.out.println("What's the new Price");
							Integer price = in.nextInt();
							model[index].setPrice(price);
							break;
				case"storage":
							System.out.println("What's the new Storage");
							Integer storage =in.nextInt();
							model[index].setStorage(storage);
							break;
				default:
							throw new IllegalArgumentException("Unexecepted Value "+update);
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
				break;
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
		String sort = in.next();
		for(Integer index=0;index<model.length;index++) {
			for(Integer jindex=index+1;jindex<model.length;jindex++) {
				if(sort.equalsIgnoreCase("modelName")) {
					if(model[index].getModelName().compareTo(model[jindex].getModelName())>0) {
						temp=model[index];
						model[index]=model[jindex];
						model[jindex]=temp;
					}
				}
				else if(sort.equalsIgnoreCase("serialno")) {
					if(model[index].getSerialno().compareTo(model[jindex].getSerialno())>0) {
						temp=model[index];
						model[index]=model[jindex];
						model[jindex]=temp;
					}
				}
				else if(sort.equalsIgnoreCase("color")) {
					if(model[index].getColor().compareTo(model[jindex].getColor())>0) {
						temp = model[index];
						model[index]=model[jindex];
						model[jindex]=temp;
					}
				}
				else if(sort.equalsIgnoreCase("price")) {
					if(model[index].getPrice().compareTo(model[jindex].getPrice())>0) {
						temp=model[index];
						model[index]=model[jindex];
						model[jindex]=temp;
					}
				}
				else if(sort.equalsIgnoreCase("storage")) {
					if(model[index].getStorage().compareTo(model[jindex].getStorage())>0) {
						temp=model[index];
						model[index]=model[jindex];
						model[jindex]=temp;
					}
				}
			}
		}
	}
}