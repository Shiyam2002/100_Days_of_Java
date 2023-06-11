package _100_days_of_java;

public class String_Rotation {
	public static void main(String[] args) {
		   System.out.println(
	                "JakammaMayamma and MayammaJakamma"
	                + " are rotation of each other : "
	                + isRotation("JakammaMayamma", "MayammaJakamma"));
	        System.out.println(
	                "VanakamJava and PythonVanakam"
	                + " are rotation of each other : "
	                + isRotation("VanakamJava", "PythonVanakam"));
	}
	private static boolean isRotation(String str, String rotation) {
	    String str2 = str + str;
	    
        if (str2.contains(rotation)) {
            return true;
        }
        return false;
	}
}