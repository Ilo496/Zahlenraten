import javax.swing.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static Integer meinenummer = ThreadLocalRandom.current().nextInt(100 + 1);

    public static void main(String[] args) {
        try{
            nextround();
        } catch(Exception error){
            System.out.println("Bitte gebe eine Zahl ein");
        }
    }


    public static void nextround(){
        System.out.println("Rate die Zahl!");
        Scanner scanner =new Scanner(System.in);
        Integer nummer = scanner.nextInt();
        raten(nummer);
    }

    public static void raten(Integer nummer) {
        if(nummer == meinenummer) {
            System.out.println("Richtig Geraten");
        } else {
            System.out.println("Falsch geraten");

            if(nummer < meinenummer) {
                System.out.println("Deine Zahl ist zu klein");
            } else {
                System.out.println("Deine Zahl ist zu groß");
            }
        }
    }
}