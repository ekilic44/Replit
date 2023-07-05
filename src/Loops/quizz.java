package Loops;

public class quizz {
    public static void main(String[] args) {
        int wd=0;
        String[] days ={ "Sun", "Mon", "Wed", "Sat"};
        for (int i = 0; i < days.length; i++) {
            switch (days[i]){
                case"Sat":
                case "Sun":
                    wd-=1;
                    break;
                case "mon":
                    wd+=1;
                case "wed":
                    wd+=2;


            }

        }
        System.out.println("wd = " + wd);
    }
}
