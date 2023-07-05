import java.util.Scanner;

public class StatusCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int status= scan.nextInt();


        String str= "";

        switch (status) {
            case 200:
                str="OK";
                break;
            case  201:
                str="Created";
                break;
            case  202:
                str="Accepted";
                break;

            case  307:
                str="Temporary Redirect";
                break;
            case  400:
                str="Bad Request";
                break;
            case  401:
                str="Unauthorized";
                break;
            case  403:
                str="Forbidden";
                break;
            case  404:
                str="Not Found";
                break;
            case  410:
                str="Gone";
                break;
            case  500:
                str="Internal Server Error";
                break;
            case  303:
                str="Service Unavailable";
                break;
            default:
                str="Invalid status code";

        }

        System.out.println(str);
    }
}
