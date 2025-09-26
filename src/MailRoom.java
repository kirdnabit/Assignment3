import java.util.Scanner;
import java.util.ArrayList;

public class MailRoom {

    public static boolean isValidLetter(String dA, String rA, double l, double w, double t) {
        return (!dA.isEmpty()) && (!rA.isEmpty()) &&
                (l >= 5 && l <= 11.5) &&
                (w >= 3.5 && w <= 6.125) &&
                (t >= 0.007 && t <= 0.25) &&
                ((l - w) >= 1.5);
    }

    public static boolean handleLetter(Letter letter, ArrayList<Mail> letters) {
        if (isValidLetter(letter.getdeliveryAddress(), letter.getReturnAddress(), letter.getLength(), letter.getWidth(), letter.getThickness())) {
            letters.add(letter);
            return true;
        }
        return false;
    }

    public static boolean isValidFlat(String dA, String rA, double l, double w, double t, String flat) {
        return (!dA.isEmpty()) && (!rA.isEmpty()) &&
                (l >= 11.5 && l <= 15) &&
                (w >= 6.125 && w <= 12) &&
                (t >= .25 && t <= .75) && (flat.equals("DOCUMENTS"));

    }

    public static boolean handleFlat(Flat flat, ArrayList<Mail> flats) {
        if (isValidFlat(flat.getdeliveryAddress(), flat.getReturnAddress(), flat.getLength(), flat.getWidth(), flat.getThickness(), flat.getContents())) {
            flats.add(flat);
            return true;
        }
        return false;
    }

    public static boolean isValidRegBox(String dA, String rA, double l, double w, double h, double wt, double c) {
        return (!dA.isEmpty()) && (!rA.isEmpty()) &&
                (l >= 6 && l <= 27) &&
                (w >= .25 && w <= 17) &&
                (h >= 3 && h <= 17) && (wt >= 0 && wt <= 70) && (c >= 0 && c <= 50);
    }

    public static boolean handleRegularBox(RegularBox regBox, ArrayList<Mail> regBoxes) {
        if (isValidRegBox(regBox.getdeliveryAddress(), regBox.getReturnAddress(), regBox.getLength(), regBox.getWidth(), regBox.getHeight(), regBox.getWeight(), regBox.getCount())) {
            regBoxes.add(regBox);
            return true;
        }
        return false;
    }

    public static boolean isValidLiveBox(LiveBox liveBox) {
        if (liveBox.getAnimal().equals("HONEYBEES")) {
            if (liveBox.getCount() < 0 || liveBox.getCount() > 20) {
                return false;
            }
        } else if (liveBox.getAnimal().equals("CHICKEN")) {
            if (liveBox.getCount() < 0 || liveBox.getCount() > 10) {
                return false;
            }
            if (liveBox.getAge() < 0 || liveBox.getAge() > 1) {
                return false;
            }
        }
        return (!liveBox.getdeliveryAddress().isEmpty()) && (!liveBox.getReturnAddress().isEmpty())
                && (liveBox.getLength() <= 6 && liveBox.getLength() >= 27) && (liveBox.getWidth() >= .25 && liveBox.getWidth() <= 17)
                && (liveBox.getHeight() >= 3 && liveBox.getHeight() <= 17);}

        public static boolean handleLiveBox (LiveBox liveBox, ArrayList < Mail > liveBoxes){
            if (isValidLiveBox(liveBox)) {
                liveBoxes.add(liveBox);
                return true;
            }
            return false;
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Welcome to KSUPS\n");
            ArrayList<Mail> deliver = new ArrayList<Mail>();

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
}
