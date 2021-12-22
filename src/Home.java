    //Student ID = 2031192
    //Group name for Assignment 010 = SKY( Sandesh Kashish Yash )

import java.util.Scanner;

    // This is the main page which contains the public static void main
    // and functions with the running of the code!

public class Home {

    //The home page displays the various files of our Program!
    static void HOme() {
        System.out.println("*********");
        System.out.println("Welcome to the fgf Budget Software");
        System.out.println("*********");
        System.out.println("a. View Profile");
        System.out.println("b. Funds");
        System.out.println("c. Teams");
        System.out.println("d. Allot");
        System.out.println("e. View Profile in a text file");
        System.out.println("f. Exit");

        System.out.println("Press the respective buttons to proceed ");
    }

    // The main function of this method is to ask whether the user wants to continue or not
    static void WouldYouLikeTo(){

        System.out.println("*********************************************************************************************");
        System.out.println("Would you like to continue further?");
        System.out.println("Please choose y || n ");
        Scanner choice001 = new Scanner(System.in);

        //Attribute
        String YourOption = choice001.nextLine();

        switch (YourOption){

            case("y"):
                HOme();
                Choose();
                break;

            case("n"):
                System.out.println("See you next time then!");
                break;
            default:
                System.out.println("   Please Enter a valid option :)  ");
        }

    }

    static void Choose(){
        //This method allows the user to choose the options where they want to lead
        Scanner choices = new Scanner(System.in);
        //Attribute
        String pages = choices.nextLine();

        switch (pages) {


            case ("a"):
                Profile profile_viewer = new Profile();
                profile_viewer.profile();
                WouldYouLikeTo();
                HOme();
                break;

            case ("b"):
                Funds Home_PAge = new Funds();
                Home_PAge.Funds_Page();
                WouldYouLikeTo();
                HOme();
                break;

            case ("c"):
                Teams teams = new Teams();
                teams.Teamss();
                WouldYouLikeTo();
                HOme();
                break;

            case ("d"):
                Allot allotments = new Allot();
                allotments.Allotment_Page();
                WouldYouLikeTo();
                HOme();
                break;

            case("e"):
                Profile view_profile = new Profile();
                view_profile.File_maker();
                WouldYouLikeTo();
                HOme();
                break;

            case ("f"):
                System.out.println("byeeeeeeee");
                break;

            default:
                System.out.println("Please enter a valid option");
                WouldYouLikeTo();

        }


    }

    //This is the Main file which runs the complete program
    //Everything in the program code is either interrelated or is inside a method
    public static void main (String[] args)
    {
        Password RoboVerify = new Password();
        RoboVerify.Login();

        HOme();
        Choose();
    }

}