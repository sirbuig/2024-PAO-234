package ro.unibuc.fmi;

public class Instructions {

    public static void main (String args[]) {

        // if

        if ( 1 > 2 ) {
            System.out.println("My math is not so good");
        } else {
            System.out.println("All is fine");
        }

        int x = (10< 15) ? 10 : 15;
        System.out.println(x);


        // switch
        String today = "THURSDAY";

        switch (today) {
            case "MONDAY": {
                System.out.println("Today is monday");
                break;
            }
            case "TUESDAY": {
                System.out.println("Today is tuesday");
                break;
            }
            case "WEDNESDAY", "THURSDAY" :
                System.out.println("Today we have the lab");
            default:
                System.out.println("Weekend has come!");
        }

        // for
        int i;
        for (i=1 ; i<=10 ; i++) {
            System.out.println(i + " " + 2*i);
        }

        String[] days = {"MONDAY", "TUESDAY", "SUNDAY"};
        for (String day:days) {
            System.out.println(day);
        }

//        for (;;)  {
//            System.out.println("VREAU SA IES");
//        }

        i=0;
        while( i < 10){
            i++;
            System.out.println(i);
        }
        System.out.println("here we go to do...while");
        do {
            System.out.println(10*i);
            i++;
        } while(i<=20);
    }
}
