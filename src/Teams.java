import java.util.HashMap;
import java.io.File;
import java.util.Scanner;


public class Teams {
    static void Teamss(){
        //This is the main teams page where the user can choose whether he/she wants to view teams or make a new teams
        System.out.println("a. View Teams");
        System.out.println("b. +New Team");
        System.out.println("Please choose an option");

        Scanner team_option = new Scanner(System.in);
        //Attribute
        String team_option_choices = team_option.nextLine();

        switch(team_option_choices){
            case("a"):
                View_Teams();
                break;
            case("b"):
                New_Team();
                break;
            default:
                System.out.println("Please enter a valid option");


        }

    }


    static void View_Teams(){
        // Here is a list of all the team members which can be viewed under the section of View teams
        HashMap<String, String> Team_1 = new HashMap<String, String>();

        System.out.println("Coding Team");
        Team_1.put("T_Code_001", "Raj");
        Team_1.put("T_Code_002", "Ajay");
        Team_1.put("T_Code_003", "Vijay");
        Team_1.put("T_Code_004", "Gourav");
        System.out.println(Team_1);

        System.out.println("***********************************************************************");


        HashMap<String, String> Team_2 = new HashMap<String, String>();

        System.out.println("Design Team");
        Team_2.put("T_Code_011", "Akshat");
        Team_2.put("T_Code_012", "Arun");
        Team_2.put("T_Code_013", "Yati");
        Team_2.put("T_Code_014", "Varun");
        System.out.println(Team_2);

        System.out.println("***********************************************************************");

        HashMap<String, String> Team_3 = new HashMap<String, String>();

        System.out.println("Test Team");
        Team_3.put("T_Code_111", "Vishal");
        Team_3.put("T_Code_112", "Ahmad");
        Team_3.put("T_Code_113", "Alifia");
        Team_3.put("T_Code_114", "Himanshi");
        System.out.println(Team_3);

        System.out.println("***********************************************************************");

        HashMap<String, String> Team_4 = new HashMap<String, String>();

        System.out.println("<Maintenance Team");
        Team_4.put("T_Code_121", "Venna");
        Team_4.put("T_Code_122", "Valeria");
        Team_4.put("T_Code_123", "Emma");
        Team_4.put("T_Code_124", "Ela");
        System.out.println(Team_4);

        System.out.println("***********************************************************************");

    }

    static void New_Team(){

        // The user can make a new team using this method
        System.out.println("Enter the total number of team members");
        Scanner Value = new Scanner(System.in);
        //Attribute
        int noOfpeople = Value.nextInt();

        System.out.println("***********************************************************************");
        System.out.println("Enter the team code:");
        Scanner Value_2 = new Scanner(System.in);
        //Attribute
        String Team_Code = Value_2.nextLine();
        System.out.println("***********************************************************************");
        System.out.println(
                "No. of  team members:"+" "+ noOfpeople +" "+
                "Team code" +" "+"=" +" "+ "T_Code_"+ Team_Code);

    }
}
