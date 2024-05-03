import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String myBrotherName; //1 задание

        final int NUM = 28; //2 задание

        String word = "birthday";//3 задание

        myBrotherName = "Askat";// //4 задание
        System.out.println("результат вычисления = " + (myBrotherName + " " + NUM));

        System.out.println(myBrotherName);//5 задание
        System.out.println(NUM);
        System.out.println(word);


        if (NUM > 0) {  //6 задание
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM < 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner scan = new Scanner(System.in);//7 задание
        System.out.println("Введите ваше имя: ");

        String Name = scan.nextLine(); //8 задание

        System.out.println("Здравствуйте, " + Name + "!");// 9 задание


    }
}