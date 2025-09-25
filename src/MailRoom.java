import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class MailRoom {

    public static boolean isValidLetter(String dA, String rA,double l, double w, double t){
        return (!dA.isEmpty()) && (!rA.isEmpty()) &&
                (l >= 5 && l <= 11.5) &&
                (w >= 3.5 && w <= 6.125) &&
                (t >= 0.007 && t <= 0.25) &&
                ((l - w) >= 1.5);
    }


    public static boolean isValidFlat(String dA, String rA, double l, double w, double t, String flat){
        return (!dA.isEmpty()) && (!rA.isEmpty()) &&
                (l >= 11.5 && l <= 15) &&
                (w >= 6.125 && w <= 12) &&
                (t >= .25 && t <= .75) && (flat.equals("DOCUMENTS"));

    }

    public static boolean handleLetter(Letter letter, ArrayList<Mail> letters) {
        if (isValidLetter(letter.getdeliveryAddress(),letter.getReturnAddress(),letter.getLength(), letter.getWidth(), letter.getThickness())){
            letters.add(letter);
            return true;
        }
        return false;
    }

    public static boolean handleFlat(Flat flat, ArrayList<Mail> flats){
        if (isValidFlat(flat.getdeliveryAddress(), flat.getReturnAddress(), flat.getLength(), flat.getWidth(), flat.getThickness(), flat.getContents())){
            flats.add(flat);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to KSUPS\n");
        int option = 0;
        while (option != 6) {
            System.out.println("1- Send letter\n" +
                    "2- Send flat\n" +
                    "3- Send regular box\n" +
                    "4- Send live box\n" +
                    "5- Dispatch items\n" +
                    "6- Quit\n" +
                    "Enter option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:

            }
        }
    }
}
