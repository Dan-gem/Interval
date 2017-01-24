import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 100 и программа отределит в какой числовой промежуток вы попали: ");
        Scanner in = new Scanner(System.in); // Объект класса Scanner для обработки ввода с клавиатуры.
        int f = in.nextInt();

//        String o;

        boolean a = 0 <= f && f <= 14;
        boolean b = 15 <= f && f <= 35;
        boolean c = 36 <= f && f <= 50;
        boolean e = 50 <= f && f <= 100;

//        o = (f.equals(a))?(System.out.println("Вы попали в диапазон от 0 до 14")):(" ");

//        boolean a = (0 <= f && f >= 14);
//            if (f.equals(a)) {
//            System.out.println("Вы попали в диапазон от 0 до 14");
//
//            boolean b = 15 <= f && f >= 35;
//            if (f.equals(b)) {
//                System.out.println("Вы попали в диапазон от 15 до 35");
//            } else {
//
//            }
//            boolean c = 36 <= f && f >= 50;
//            if (f.equals(c)) {
//                System.out.println("Вы попали в диапазон от 36 до 50");
//            } else {
//
//            }
//            boolean e = 50 <= f && f >= 100;
//            if (f.equals(e)) {
//                System.out.println("Вы попали в диапазон от 50 до 100");
//            } else {
//
//            }


        //String b = in.next();

        switch (f) {
            case "a": {
                System.out.println("Вы попали в диапазон от 0 до 14");
                break;
            }

            case "b": {

                System.out.println("Вы попали в диапазон от 15 до 35");
                break;
            }

            case "c": {

                System.out.println("Вы попали в диапазон от 36 до 50");
                break;
            }

            case "e": {

                System.out.println("Вы попали в диапазон от 50 до 100");
                break;
            }

            default: {
                System.out.println("введите число от 0 до 100");
                break;
            }


        }
    }
}




