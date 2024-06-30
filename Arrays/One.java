//garbage collector in java to free the resources that we allocated manually.

public class One {
	public static void main(String[] args) {
		int array[] = new int[10];
		// int []array = new int[10];
		// int[] array = new int[10];
		
		// int[][] array = new int[5][5];
		// int [][]array;
		// int[] []array;
		// int[] array[];
		// int array[][];
		/*
		for(int i=0; i<array.length; i++) {
			// System.out.print(array[i] + ", ");
			array[i] = (int)(Math.random() * 100);
		}
		/*
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		* /
		
		//advanced for loop / foreach loop (used for only traversing purpose)
		for (int i : array) {
			System.out.print(i + ", ");
		}
		*/
		
		char chars[] = new char[10];// = {'a', 'g', 't', 'e', 's', 'd', 'w', 'w', 'r', 't'};
		
		System.out.print("chars = { ");
		for(char ch : chars) {
			System.out.print("'" + ch + "', ");
		}
		System.out.print("\b\b };");
		
		
		
	}
}

//in java 21 void main()