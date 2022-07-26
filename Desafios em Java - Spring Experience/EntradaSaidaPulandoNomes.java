// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;
import java.util.Locale;

public class Problem {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		//DD/MM/AA
		String[] a = new String[10];
		for(int i=0 ; i<10 ; i++)
			a[i] = sc.nextLine();
		System.out.printf("%s\n%s\n%s\n",a[2],a[6],a[8]);
		sc.close();

	}
}
