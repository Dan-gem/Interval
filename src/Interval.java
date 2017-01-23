import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 100 и программа отределит в какой числовой промежуток вы попали: ");
        Scanner in = new Scanner(System.in); // Объект класса Scanner для обработки ввода с клавиатуры.
        String a = in.next();

        //String b = in.next();

        switch (a) {
            case "<=14": { //"(0>=a&&a<=14)"
                System.out.println("Вы попали в диапазон от 0 до 14");
                break;
            }
            case "(a<=35)": {

                System.out.println("Вы попали в диапазон от 15 до 35");
                break;
            }
            case "(36>=a<=50)": {

                System.out.println("Вы попали в диапазон от 36 до 50");
                break;
            }
            case "(50>=a<=100)": {

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

