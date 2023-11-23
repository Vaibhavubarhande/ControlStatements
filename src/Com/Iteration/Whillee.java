package Com.Iteration;

public class Whillee {
	
	public static void main(String[] args) {
		
		int i=2;
		while(i<=100) {
			
			if (i==2 || i==3 || i==5 || i==7) {
				System.out.print(i +" ");
			}else {
				if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
					System.out.print(i+ " ");
				}
			}
			i++;
		}
	}

}
