import java.util.Scanner;
import java.util.ArrayList;

public class MailRoom {

    public static boolean isValidLetter(Letter letter) {
        return (!letter.getDeliveryAddress().isEmpty()) && (!letter.getReturnAddress().isEmpty()) &&
                (letter.getLength() >= 5 && letter.getLength() <= 11.5) && (letter.getWidth() >= 3.5 && letter.getWidth() <= 6.125) &&
                (letter.getThickness() >= .007 && letter.getThickness() <= .25) && (letter.getLength() - letter.getWidth() >= 1.5);
    }

    public static boolean handleLetter(Letter letter, ArrayList<Mail> letters) {
        if (isValidLetter(letter)) {
            letters.add(letter);
            return true;
        }
        return false;
    }

    public static boolean isValidFlat(Flat flat) {
        return (!flat.getDeliveryAddress().isEmpty()) && (!flat.getReturnAddress().isEmpty()) &&
                (flat.getLength() >= 11.5 && flat.getLength() <= 15) && (flat.getWidth() >= 6.125 && flat.getWidth() <= 12) &&
                (flat.getThickness() >= .25 && flat.getThickness() <= .75) && (flat.getContents().equalsIgnoreCase("DOCUMENTS"));

    }

    public static boolean handleFlat(Flat flat, ArrayList<Mail> flats) {
        if (isValidFlat(flat)) {
            flats.add(flat);
            return true;
        }
        return false;
    }

    public static boolean isValidRegBox(RegularBox regBox) {
        return (!regBox.getDeliveryAddress().isEmpty()) && (!regBox.getDeliveryAddress().isEmpty()) &&
                (regBox.getLength() >= 6 && regBox.getLength() <= 27) &&
                (regBox.getWidth() >= .25 && regBox.getWidth() <= 17) &&
                (regBox.getHeight() >= 3 && regBox.getHeight() <= 17) && (regBox.getWeight() >= 0 && regBox.getWeight() <= 70) &&
                (regBox.getCount() >= 0 && regBox.getCount() <= 50);
    }

    public static boolean handleRegularBox(RegularBox regBox, ArrayList<Mail> regBoxes) {
        if (isValidRegBox(regBox)) {
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
        }
        else if (liveBox.getAnimal().equals("CHICKEN")) {
            if (liveBox.getCount() < 0 || liveBox.getCount() > 10) {
                return false;
            }
            if (liveBox.getAge() < 0 || liveBox.getAge() > 1) {
                return false;
            }
        }
        else{
            return false;
        }
        return (!liveBox.getDeliveryAddress().isEmpty()) && (!liveBox.getReturnAddress().isEmpty())
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
                System.out.print("");

                switch (option) {
                    case 1:
                        System.out.print("Enter the delivery address: ");
                        String dA1 = sc.nextLine();

                        System.out.print("Enter the return address: ");
                        String rA1 = sc.nextLine();

                        System.out.print("Enter the width of your mail: ");
                        double w1 = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter the length of you mail: ");
                        double l1 = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter the thickness of your mail: ");
                        double t1 = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter the contents of your letter: ");
                        String c1 = sc.nextLine();

                        Letter newLetter = new Letter(dA1, rA1, w1, l1, t1, c1);

                        if (handleLetter(newLetter, deliver)){
                            System.out.println("Letter accepted for delivery.\n");
                    }
                        else{
                            System.out.println("Letter cannot be mailed.\n");
                        }
                        break;

                    case 2:
                        System.out.print("Enter the delivery address: ");
                        String dA2 = sc.nextLine();

                        System.out.print("Enter the return address: ");
                        String rA2 = sc.nextLine();

                        System.out.print("Enter the width of your mail: ");
                        double w2 = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter the length of you mail: ");
                        double l2 = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter the thickness of your mail: ");
                        double t2 = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter the contents of your Flat: ");
                        String c2 = sc.nextLine();

                        Flat newFlat = new Flat(dA2, rA2, w2, l2, t2, c2);

                        if (handleFlat(newFlat, deliver)){
                            System.out.println("Flat accepted for delivery.\n");
                    }
                        else{
                            System.out.println("Flat cannot be mailed.\n");
                        }
                        break;

                    case 3:
                        System.out.print("Enter the delivery address: ");
                        String dA3 = sc.nextLine();

                        System.out.print("Enter the return address: ");
                        String rA3 = sc.nextLine();

                        System.out.print("Enter the width of your mail: ");
                        double w3 = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter the length of you mail: ");
                        double l3 = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter the height of your mail: ");
                        double h = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter how many items your box has: ");
                        int count = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter the weight of your box: ");
                        double wt = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter the contents of your box: ");
                        String contents = sc.nextLine();

                        RegularBox newRegBox = new RegularBox(dA3, rA3, w3, l3, h, count, contents, wt);

                        if (handleRegularBox(new RegularBox(), deliver)){
                            System.out.print("Regular box accepted for delivery.\n");
                        }
                        else {
                            System.out.print("Regular box cannot be mailed.\n");
                        }
                        break;

                    case 4:
                        System.out.print("Enter the delivery address: ");
                        String dA4 = sc.nextLine();

                        System.out.print("Enter the return address: ");
                        String rA4 = sc.nextLine();

                        System.out.print("Enter the width of your mail: ");
                        double w4 = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter the length of your mail: ");
                        double l4 = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter the height of your mail: ");
                        double h2 = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter how many items your box has: ");
                        int count2 = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter what animal is being shipped: ");
                        String animal = sc.nextLine();

                        System.out.print("Enter age of the oldest animal, in days: ");
                        int age = sc.nextInt();
                        sc.nextLine();

                        LiveBox newLiveBox = new LiveBox(dA4, rA4, w4, l4, h2, count2, animal, age);

                        if (handleLiveBox(newLiveBox, deliver)){
                            System.out.print("Live box accepted for delivery.\n");
                        }
                        else{
                            System.out.print("Live box cannot be delivered.\n");
                        }
                        break;

                    case 5:
                        System.out.print("DISPATCHING THE FOLLOWING ITEMS FOR DELIVERY: ");
                        if (deliver.isEmpty()) {
                            System.out.println("Delivery queue is empty.");
                        }
                        else {
                            for (Mail m : deliver) {
                                System.out.println("==========");
                                System.out.println(m);
                            }
                            deliver.clear();
                        }
                        break;

                    case 6:
                        System.out.print("Quitting...");
                }
            }

        }
    }
