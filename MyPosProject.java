import java.util.*;

public class MyPosProject {
    private static final String French_Fries = null;
    private static final String Thanks = null;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        AddOn addon = new AddOn();
        
        System.out.println(
            "                 \n <---|Menu|---> \n                \n 1. French_Fries\n 2. Burger\n 3. Coke\n                 \n <---|Press 0 For complete the order|---> \n                ");
            
            int order;
            do {

                System.out.print("What would you like to order?");
                 order = sc.nextInt();
                
                switch(order){
    
                case  1:
                addon.BurgerAddon();
                addon.Varients();
                addon.Size();
                break;
                case  2:
                addon.Size();
                break;
                case 3:
                addon.Size();
                break;
            }
               
        } 
        
        while(order != 0);

            System.out.println("Enjoy Your Meal...");
    }   

}