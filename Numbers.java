import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class Numbers {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		for (int i = 1; i<=100; i++){
			
			if  (i%3 == 0 && i%5 == 0)
				System.out.println(i);
			
			else if (i % 3 == 0)
				System.out.println("Hello");
			
			else if (i % 5 == 0)
				System.out.println("World");
			
			else 
				System.out.println(i);
			
		}
	}

}
