
public class JavaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2, j = 1;
		while (i < 10) {
			while (j < 10) {
				System.out.print(i + "  *  " + j + "  =  " + i * j + "\t");
				j++;
			}
			System.out.print("\n");
			i++;
			j=1;
		}
	}
}
