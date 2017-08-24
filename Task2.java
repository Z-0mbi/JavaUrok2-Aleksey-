import java.util.Scanner;

/*Напечатать таблицу умножения на число n, 
 * которое вводится с клавиатуры 
 */
public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число: ");
		if (sc.hasNextInt()) {
			int n = sc.nextInt();
			for (int i = 1; i < 10; i++) {
				System.out.println(n + " * " + i + " = " + (n * i));
			}
		}
		else {
			System.out.println("Не корректный ввод");
		}
			
		
	}

}
