import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Scanner;
/**
 *
 * @author Morgan
 */

public class BikePart {
      
    public void enter() {
        
        ArrayList<String> partInventory = new ArrayList<String>(); 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter part information: ");
        String part = input.nextLine();
        partInventory.add(part);
    }
    
    ArrayList<String> db = new ArrayList<>();
    int b = db.size();
    
    public void sell(String p) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter part number: ");
        int number = input.nextInt();
        //part number, display part and cost; on sale?;
        int z = 0;
        for(int i=0;i<b;i++){
            String s = db.get(i);
            if (s.contains(p)){
                String[] det = s.split(",");
                System.out.print(det[0]+", ");
                String m = det[4];
                if (m.equals("true")){
                   System.out.print(det[3]);
                   System.out.print("On sale.");}
                else
                   System.out.print(det[2]);
                System.out.print("Not on sale.");}
            //error if part is not available;
            else{
                z++;}
            if (z == b) {
                System.out.println("Part not found.");}
        }
        //prints time of sale;
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj); 
        //decrement quantity;  
        partInventory.remove(      )
   }
   
}
