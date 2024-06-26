import java.util.Scanner;

public class One {
	
	public void method_name(int params) {
		System.out.println("Number from method_name: " + params);
	}
	
	static float add(float a, float b) {
		return a+b;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any integer: ");
		int number = sc.nextInt();
		
		System.out.println("Number: " + number);
		
		One o = new One();
		o.method_name(number);
		
		System.out.println("Static Mehtod: " + One.add(2.7f, 3.1f));
		
		sc.close();
	}
}