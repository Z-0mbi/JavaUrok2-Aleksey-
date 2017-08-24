/*Написать программу, которая генерирует 10 случайных чисел
 *и вычисляет их среднее арифметическое

 */
public class Task3 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += Math.random() * 100;
		}
		System.out.println("Среднее арефметическое 10 случайных чисел: " + sum/10 + "." + (sum*10/10%10));

	}

}
