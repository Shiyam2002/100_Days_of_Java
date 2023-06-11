package _100_days_of_java;

public class IsLeader {
	public static void main(String[] args) {
		//Element is the leader if it is greater than right side of elements.
		int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
		System.out.println("Finding leaders in an array using brute force : ");
	     for (int i = 0; i < arr.length; i++) {
	         boolean isLeader=true;
	         for (int j = i+1; j < arr.length; j++) {
	             if(arr[i] <= arr[j])
	             { 
	               isLeader=false;
	               break;
	             } 
	      }
	     if(isLeader)
	         System.out.print(arr[i]+" ");
	    } 
	}
}