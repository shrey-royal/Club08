import java.util.Scanner;

public class CharArray {
	public static void main(String[] args) {
		char[] arr = new char[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter arr["+i+"]: ");
			arr[i] = sc.next().charAt(0);
		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("\b\b ");
	}
}