import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        
        System.out.print("Is it the weekend? (y/n): ");
        char weekend = obj.next().charAt(0);
        
        if (weekend == 'y') {
            System.out.print("Do you want to watch a movie? (y/n): ");
            char movie = obj.next().charAt(0);
            
            if (movie == 'y') {
                System.out.print("Do you want to watch an action movie? (y/n): ");
                char action = obj.next().charAt(0);
                
                if (action == 'y') {
                    System.out.print("Deadpool & Wolverine? (y/n): ");
                    char dap = obj.next().charAt(0);
                    
                    if (dap == 'y') {
                        System.out.print("Good choice!");
                    }
                    else {
                        System.out.print("You can watch Thangalaan!");
                    }
                }
                else {
                    System.out.print("Everything else is boring!");
                }
            }
            else {
                System.out.print("Do something else then!");
            }
        } 
        else {
            System.out.print("Go in the weekend!");
        }
    }
}