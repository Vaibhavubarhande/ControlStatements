package Com.Iteration;

public class Even {

	public static void main(String[] args) {

		int i = 1;

		int count = 0;

		while (i <= 100) {

			if (i % 2 == 0) {

				count++;
				System.out.println(i);
			}
			i++;
		}
		System.out.println("Total even is : " + count);

	}

}
