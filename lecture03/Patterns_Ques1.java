package lecture03;

public class Patterns_Ques1 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while (row <= n) {
			int cst = 0;
			while (cst < n) {
				System.out.print("* ");
				cst++; 
			}
			System.out.println();
			row++; 
		}
	}

}
