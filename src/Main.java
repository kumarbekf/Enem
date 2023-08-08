
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();


        try {
           Days days =
                   Days.valueOf(string.toUpperCase());
            switch (days) {
                case MONDAY:
                    System.out.println("Read Java on Monday");
                    break;
                case TUESDAY:
                    System.out.println("On Tuesday I will attend English classes and practice");
                    break;
                case WEDNESDAY:
                    System.out.println("I will be reading Java on Wednesday");
                    break;
                case THURSDAY:
                    System.out.println("Thursday practice day lesson");
                    break;
                case FRIDAY:
                    System.out.println("I'm reading Java on Friday");
                    break;
                case SATURDAY:
                    System.out.println("Saturday practice lesson");
                case SUNDAY:
                    System.out.println("Weekend");
            }
        }catch (IllegalArgumentException q){
            System.out.println("Мындай кун жок");
        }
    }
}