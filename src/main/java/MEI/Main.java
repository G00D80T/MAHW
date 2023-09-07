package MEI;

public class Main {
    public static void main(String[] args) {

        double b = 51.0;

        if (b % 2 == 0) {
            System.out.println("ЧЁТНОЕ");
        } else {
            System.out.println("НЕЧЁТНОЕ");
        }
        System.out.println("число = " + b);



        String myString = "бабёр";
        char[] c = myString.toCharArray();

        for (char value : c) {
            if (value == 'a' || value == 'а' || value == 'A' || value == 'А') {
                break;
            } else {
                System.out.print(value + "\n");
            }
        }
    }
}