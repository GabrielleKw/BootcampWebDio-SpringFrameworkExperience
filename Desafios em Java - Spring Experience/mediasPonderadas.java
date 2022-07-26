// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.*;
import java.io.IOException;
import java.util.Locale;

 
public class Program
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int n;
		double x,y,z, mediapond;
		
		n = sc.nextInt();
		
		while (n > 0){
			x = sc.nextDouble();
			y = sc.nextDouble();
			z = sc.nextDouble();
			mediapond = (x * 2 + y * 3 + z * 5) / 10;
			System.out.printf("%.1f\n",mediapond);
			n = n - 1;
		}
		sc.close();
    
        
  }
}
