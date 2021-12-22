import java.util.Scanner;
public class Allot {


    static void Allot_Funds(){
        //This method allows the authority to allot the claimed amount to the employees.
        Scanner Allot_Fund = new Scanner(System.in);
        System.out.println("Please enter the amount that you want to allot!");
        //Attribute
        int new_allotment =  Allot_Fund.nextInt();
        System.out.println("Your alloted amount in GBP is:" + new_allotment );
        System.out.println("*************************************************************************");
        Scanner allot_funds_details = new Scanner(System.in);
        System.out.println("Enter Team member code ");
        //Attribute
        int team_code = allot_funds_details.nextInt();
        System.out.println("The fund amount of GBP:"+" "+ new_allotment+" "+"has been alloted to" +" "+ "T_Code_" + team_code);

    }

    static void View_Allotments(){
        //This method allows the user to view the allotments
        Funds prev_allotments = new Funds();
        prev_allotments.Previous_Claim();
        System.out.println("These are the previous allotments which were claimed!");

    }

    static void Allotment_Page(){
        //This is the main allotment page where the user can choose what option he would like to opt for
        System.out.println("Welcome to the Allotment Page!");
        System.out.println("****************************************************************");
        System.out.println("a.View Claims ");
        System.out.println("b. Allot Funds");
        System.out.println("c. View Allotments");
        System.out.println("****************************************************************");
        System.out.println("Please select an option!");


        Scanner view_claims = new Scanner(System.in);
        //Attribute
        String option_select = view_claims.next();

        switch(option_select)
        {
            case"a":
                Funds Claim_amount = new Funds();
                Claim_amount.Previous_Claim();
                break;
            case "b":
                Allot_Funds();
                break;
            case "c":
                View_Allotments();
                break;
            default:
                System.out.println("Please enter a valid option");


        }

    }
}
