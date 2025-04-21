package testpackage;

public class Constructor {
	public int i;
	public static void main(String[] args) {
		Constructor c = new Constructor(56);

	}
	public Constructor() {
       i = 20;
       System.out.println("explict constructor: "+i);
	} 
	public Constructor(int a) {
        i = a;
        System.out.println(i);
	}
}
