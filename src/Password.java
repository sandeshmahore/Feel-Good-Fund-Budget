import java.util.Scanner;

public class Password {

// This method is used to allow the program to wait soe time to provide a better user experience
    static void Wait(int sec){

        try{
            Thread.currentThread().sleep(sec*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    //This method allows user to enter the login credentials for a verification process
    static void Login(){
        System.out.println("Show that you're not a Computer!!!!!         :)              ");
        System.out.println("*************************************************************");
        System.out.println("Type:");
        System.out.println("*************************************************************");
        System.out.println("007");


        Scanner verify = new Scanner(System.in);
        //Attribute
        int NotARobo = verify.nextInt();

        if (NotARobo == 007){
            System.out.println("Access Granted");
            System.out.println("Just a second!");
            Wait(1);
        }else{
            System.out.println("Sorry! Please Try Again!!!");
            Login();
        }

    }
}
