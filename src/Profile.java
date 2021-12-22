import java.io.FileWriter;
import java.io.IOException;
public class Profile {
    // This method shows the profile of the current user/employee
    static void profile(){
        System.out.println("*************************************************************************");
        System.out.println("Name:" + "Sandesh Mahore");
        System.out.println("*************************************************************************");
        System.out.println("Designation:"+"Founder,CEO");
        System.out.println("*************************************************************************");
        System.out.println("Team Code:"+ " T_Code_007");
        System.out.println("*************************************************************************");
        System.out.println("Contact Number:"+ "07987654563");
        System.out.println("*************************************************************************");
        System.out.println("Email address:"+ "smredgate@gmail.com");

    }

// This method enters the profile details in a text file!
    static void File_maker(){
        System.out.println("You can view the Profile in the text file :) ");
        try {
            FileWriter WriteTofile = new FileWriter("Profile.txt");
            WriteTofile.write("Name:" + "Sandesh Mahore"+" "+
                    "Designation:"+" "+"Founder,CEO"+" "+" Team Code:"+ " T_Code_007"+" "+
                    "Contact Number:"+ "07987654563"+" "+" Email address:"+ "smredgate@gmail.com");
            WriteTofile.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
