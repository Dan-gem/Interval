import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 100 и программа отределит в какой числовой диапазон вы попали: ");
        Scanner in = new Scanner(System.in); // Объект класса Scanner для обработки ввода с клавиатуры.
        int p = in.nextInt();
        String s;

        if (p > 100) { // 1-ый способ
            System.out.println("Число не попадает в диапазон от 0 до 100, введите число еще раз: ");
        } else {
            if (0 > p) {
                System.out.println("Число не попадает в диапазон от 0 до 100, введите число еще раз: ");
            } else {
                s = (p<=35)?((p<=14)?"0-14":"15-35"):((p<=50)?"36-50":"51-100"); // 2-ой способ
                System.out.println(s);
            }
        }

        
//        if (p > 100) { // 2-ый способ
//            System.out.println("Число не попадает в диапазон от 0 до 100, введите число еще раз: ");
//        } else {
//            if (0 > p) {
//                System.out.println("Число не попадает в диапазон от 0 до 100, введите число еще раз: ");
//            } else {
//                s = (0 <= p && p <= 14) ? "0-14" : ((15 <= p && p <= 35) ? "15-35" : ((36 <= p && p <= 50) ? "36-50" : (51 <= p && p <= 100) ? "51-100" : " "));
//                System.out.println(s);
//            }
//        }


//        System.out.println ("Определение квадранта в котором лежит заданная точка."); //вариант для примера
//        int x = in.nextInt();
//        int y = in.nextInt();
//        String q0;
//        q0 = (x>0) ? ((y>0) ? "1 квадрант" : "4 квадрант") : ((y>0) ? "2 квадрант" : "3 квадрант");
//
//        System.out.println (q0);
    }
}







