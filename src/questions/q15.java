package questions;

public class q15 {

	public static void main(String[] args) {
		int[] intArr= {8,16,32,64,128};
		
		// which code will print all elements in this array?
		
		for (int i:intArr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for (int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i]+" ");
		}
		
		System.out.println();
		int i=0;
		while(i<intArr.length) {
			System.out.print(intArr[i]+" ");
			i++;
		}
	}
}
