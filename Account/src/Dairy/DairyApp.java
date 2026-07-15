package Dairy;
import java.util.Scanner;
public class DairyApp {
     static void main() {
        Scanner input = new Scanner(System.in);

         Dairies dairies = new Dairies();
         Dairy dairy = null;
         while (true) {

             System.out.println("""
                 1. Create Account
                 2. Unlock Dairy
                 3. Create Entry
                 4. Find Entry
                 5. Update Entry
                 6. Delete Entry
                 7. Lock Dairy
                 """);

             System.out.println("Enter Option");
             int user = input.nextInt();
             input.nextLine();

             switch (user) {
                 case 1:

                     System.out.print("enter username: ");
                     String username = input.nextLine();
                     System.out.print("enter password: ");
                     String password = input.nextLine();
                     dairies.addDairy(username, password);
                     dairy = new Dairy(username, password);
                     break;

                 case 2:
                     if (dairy == null) {
                         System.out.println("Create an account first.");
                         break;
                     }
                     System.out.println("Enter your password: ");
                     String dairyPassword = input.nextLine();
                     dairy.unLockDairy(dairyPassword);
                     System.out.println("Dairy unlocked");
                     break;

                 case 3:
                     if (dairy == null) {
                         System.out.println("Create an account first.");
                         break;
                     }
                     System.out.print("enter title: ");
                     String title = input.nextLine();
                     System.out.print("enter body: ");
                     String body = input.nextLine();
                     dairy.createEntry(title, body);
                     System.out.println("Entry saved");
                     break;

                 case 4:
                     if (dairy == null) {
                         System.out.println("Create an account first.");
                         break;
                     }
                     System.out.println("enter id: ");
                     int id = input.nextInt();
                     System.out.println(dairy.findEntry(id));
                     break;

                 case 5:
                     if (dairy == null) {
                         System.out.println("Create an account first.");
                         break;
                     }
                     System.out.print("enter title: ");
                     String entryTitle = input.nextLine();
                     System.out.print("enter body: ");
                     String entryBody = input.nextLine();
                     System.out.println("enter id: ");
                     int entryId = input.nextInt();
                     dairy.updateEntry(entryId, entryTitle, entryBody);
                     break;

                 case 6:
                     if (dairy == null) {
                         System.out.println("Create an account first.");
                         break;
                     }
                     System.out.println("enter id: ");
                     int idForEntry = input.nextInt();
                     dairy.deleteEntry(idForEntry);
                     break;

                 case 7:
                     if (dairy == null) {
                         System.out.println("Create an account first.");
                         break;
                     }
                     dairy.lockDairy();

                 default:
                     System.out.println("Invalid input");
             }
         }
    }
}
