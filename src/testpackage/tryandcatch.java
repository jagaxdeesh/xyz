package testpackage;

public class tryandcatch {

	public static void main(String[] args) {
		try {
			int[] numbers = {1,2,3,4,5,6,7};
			System.out.println(numbers[67]);
		}
		catch(Exception e) {
			System.out.println("someting worng :" + e);
		}
		finally {
			System.out.println("this code will exeution after try and catch block of code");
		}
	}

}
