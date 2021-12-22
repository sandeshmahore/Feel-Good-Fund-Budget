import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;


public class Funds {

    static void Exit(){
        System.out.println("3. exit");
        System.exit(0);
    }
    static void GoBack(){
        System.out.print("x. Go back");
    }

    static void Transactions(){
        System.out.println("a. Previous Transactions");
        System.out.println("**********************************************************************************************");

        System.out.println("Please select an option!");
        Scanner options  = new Scanner(System.in);
        String Input = options.next();
        System.out.println("choice : "+ Input);


        switch(Input){
            case("a"):
                Previous_Transactions();
                break;
            default:
                System.out.println("Please enter a valid input");

        }

    }

    static void Previous_Transactions(){
        System.out.println("Here is the list of Previous Transactions");
        System.out.println("The amount is given in GBP:");
        System.out.println("The Team code(starting from T_Code_'') is the unique id of an employee");

        HashMap<String, Integer> Prev_Transactions = new HashMap<String, Integer>();

        Prev_Transactions.put("T_Code_121",456 );
        Prev_Transactions.put("T_Code_111",460 );
        Prev_Transactions.put("T_Code_013",254 );
        Prev_Transactions.put("T_Code_014",198 );
        Prev_Transactions.put("T_Code_122",342 );

        System.out.println(Prev_Transactions);

    }

    static void New_Claim(){
        Scanner Claim_Expense = new Scanner(System.in);
        System.out.println("Please enter the amount that you want to claim!");
        int new_Claim =  Claim_Expense.nextInt();

        System.out.println("Your Claim amount in GBP is:" + new_Claim );
        System.out.println("*************************************************************************");

        Scanner Receipt_Source = new Scanner(System.in);
        System.out.println("Where was the payment made previously?");
        String receipt = Receipt_Source.nextLine();
        System.out.println("Source of Expenditure is:"+ receipt);

    }
    static void Previous_Claim(){
        HashMap<String, Integer> claims = new HashMap<String, Integer>();
        System.out.println("Previous Claims");

        claims.put("T_Code_001",456 );
        claims.put("T_Code_002",460 );
        claims.put("T_Code_013",254 );
        claims.put("T_Code_114",198 );
        claims.put("T_Code_124",342 );

        System.out.println(claims);

    }

    static void Claim_Expense(){
        System.out.println("a. New Claim");
        System.out.println("b. Previous Claim");
        System.out.println("************************************************************************");


        System.out.println("Please enter a choice a ||  b");

            Scanner option  = new Scanner(System.in);
            //Attribute
            String input = option.next();
            System.out.println("choice : "+ input);


            switch(input)
            {
                case "a":
                    New_Claim();
                    break;
                case "b":
                    Previous_Claim();
                    break;
                default:
                    System.out.println("Please enter a valid option");

            }
    }



    static void Funds_Page(){

        System.out.println("Welcome to the Funds Page");
        System.out.println("1. Transactions");
        System.out.println("2. Claim Expense");
        System.out.println("3. Exit");

        System.out.println("Please enter a choice 1 or 2 or 3");

        Scanner value = new Scanner(System.in);
        //Attribute
        int option = value.nextInt();
        System.out.println("Option:"+ option);

        switch(option){
            case (1):
                Transactions();
                break;
            case(2):
                Claim_Expense();
                break;
            case(3):
                Exit();
                break;
            default:
                System.out.println("Please enter a valid input");

        }

        }

}






