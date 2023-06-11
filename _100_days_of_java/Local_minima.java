package _100_days_of_java;

public class Local_minima {
	  public int findLocalMinima(int [] arr, int start, int end){
	        int mid = start + (end-start)/2;
	        int size = arr.length;
	        if((mid==0 || arr[mid-1]>arr[mid]) &&
	                (mid==size-1 || arr[mid+1]>arr[mid]))
	            return arr[mid];
	        else if(mid>0 && arr[mid]>arr[mid-1]){
	            return findLocalMinima(arr, start, mid);
	        }
	        else { 
	           
	            return findLocalMinima(arr, mid+1, end);
	        }
	    }
	 
	    public static void main(String[] args) {
	        Local_minima l = new Local_minima();
	        int [] arr = {10, 5, 3, 6, 13, 16, 7};
	        System.out.println("Local Minima is: " + l.findLocalMinima(arr,0,arr.length));
	    }
}