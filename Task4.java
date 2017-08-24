/*Написать код с использованием цикла do... while, 
 *который будет последовательно распечатывать в консоли 
 *номера билетов от 200000 до 210000.
 */
public class Task4 {

	public static void main(String[] args) {
		int i = 200000;
		do {
			System.out.println(i);
			i++;
		}
		while (i < 210001);

	}

}
