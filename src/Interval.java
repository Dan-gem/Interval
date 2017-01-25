import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 100 и программа отределит в какой числовой диапазон вы попали: ");
        Scanner in = new Scanner(System.in); // Объект класса Scanner для обработки ввода с клавиатуры.
//        int f = in.nextInt();
        int p = in.nextInt();
        String s;
        String a;

        boolean e = (p>100);
        boolean s = (p<0);

//        String d;

        if (e) {
            System.out.println("Число не попадает в диапазон от 0 до 100, введите число еще раз: ");
        } else {
            a = (p<=35)?((p<=14)?"0-14":"15-35"):((p<=50)?"36-50":"51-100");
            System.out.println(a);
        }

//            a = (p<=35)?((p<=14)?"0-14":"15-35"):((p<=50)?"36-50":"51-100");
//            System.out.println(a);





//        int q;
//        int a;
//        int b;
//        int c;
//        int e;

//        String u;
//        String i;
//        String x;
//
//        s = (0<=p&&p<=15)?"a":"u";
//        u = (16<=p&&p<=36)?"b":"i";
//        i = (37<=p&&p<=50)?"c":"x";
//        x = (51<=p&&p<=100)?"e":"";
//
//        switch ("s") {
//
//            case "a": {
//                System.out.println("0-15");
//                break;
//            }
//            case "b": {
//                System.out.println("15-36");
//                break;
//            }
//            case "c": {
//                System.out.println("36-50");
//                break;
//            }
//            case "e": {
//                System.out.println("50-100");
//                break;
//            }

//        switch ("s") {
//
//            case "36>p": {
//                s = (0<=p&&p<=15)?"0-15":"15-36";
//                System.out.println("s");
//                break;
//            }
//
//            case "36<p": {
//                s = (0<=p&&p<=15)?"36-50":"50-100";
//                System.out.println("s");
//                break;
//            }

//        s = (0<=p&&p<=15)?"0-15":q;
//        q = (16<=p&&p<=35)?"16-35":q1;


                         //  "0-15":((16<=p&&p<=35)?"15-35":((35<=p&&p<=50)?"35-50":(50<=p&&p<=100)?"50-100":" "));
//        s = (0<=p&&p<=15)?"0-15":((16<=p&&p<=35)?"15-35":((35<=p&&p<=50)?"35-50":(50<=p&&p<=100)?"50-100":" "));
//        s = (0 <= p && p <= 15) ? "0-15" : ((16 <= p && p <= 35) ? "15-35" : ((35 <= p && p <= 50) ? "35-50" : (50 <= p && p <= 100) ? "50-100" : " "));
//        System.out.println(s);

//        int x = 10, y = -5;
//        String q0, q1, q2;
//        q0 = (f>0) ? ((p>0) ? "1 квадрант" : "4 квадрант") : ((p>0) ? "2 квадрант" : "3 квадрант");

//        System.out.println (q0);

//        switch ("s") {
//            case "0 <= p && p <= 15":
//                System.out.println("Ответ:"+"0-15");
//                break;
//
//            case "16 <= p && p <= 35": {
//                System.out.println("Ответ:"+"16-35");
//                break;
//            }
//            case "36 <= p && p <= 50": {
//                    System.out.println("Ответ:"+"36-50");
//                    break;
//            }
//            case "51 <= p && p <= 100": {
//                System.out.println("Ответ:"+"50-100");
//                break;
//            }
//            default: {
//                System.out.println("введите знак арифметической операции");
//                break;
//            }

//
        }
    }






