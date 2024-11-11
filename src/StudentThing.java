import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StudentThing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String socialSecurity = InputHelper.getRedExString(scan, "Please input your social security number xxx-xx-xxxx", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your social security is: " + socialSecurity);
        String studentNum = InputHelper.getRedExString(scan, "\nEnter your Student M Number:", "(M|m)\\d{5}");
        System.out.println("Your Student M Number is: " + studentNum);

        String menuChoice = InputHelper.getRedExString(scan, "Menu O - Open  S - Save  V - View  Q - Quit", "[OoSsVvQq]");
        System.out.println("You chose: " + menuChoice);
    }
}