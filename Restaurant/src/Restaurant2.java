import java.util.Scanner;


public class Restaurant2 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean quit= false;
        int sum=0;
        int momos=160,sgb=120,tortilla=80,lagoon=100;
        String order="";
        
        do{
            System.out.println("ITEM"+"\t\tPrice");
            System.out.println("1.Momos"+"\t\t"+"160");
            System.out.println("2.Stuffed Garlic Bread"+"\t"+"120");
            System.out.println("3.Tortilla"+"\t\t"+"80");
            System.out.println("4.Blue Lagoon"+"\t\t"+"100");
            System.out.println("5.Make Bill \n-------------------------------");
            System.out.println("Please choose a menu by number :");
            int choice=input.nextInt();
            
            switch(choice){
                case 1:System.out.println("*Momos*"+"  Price= "+momos+"\n-------------------");
                        sum=sum+momos;
                        order=order.concat("Momos : "+momos+" RS\n");
                        
                    break;
                case 2:
                    System.out.println("*Stuffed Garlic Bread*"+"  Price= "+sgb+"\n-------------------");
                    sum=sum+sgb;
                    order=order.concat("Stuffed Garlic Bread : "+sgb+" RS\n");
                    
                       break;
                case 3:
                    System.out.println("*Tortilla* "+"  Price= "+tortilla+"\n-------------------");
                    sum=sum+tortilla;
                    order=order.concat("Tortilla : "+tortilla+" RS\n");
                      break;
                case 4:
                    System.out.println("*Blue Lagoon* "+"  Price= " +lagoon+"\n-------------------");
                    sum=sum+lagoon;
                    order=order.concat("Blue Lagoon : "+lagoon+" RS\n");
                    break;
                case 5:
                     quit=true;
                     
                    break;
                default:
                    System.out.println("Wrong input");
            }
        
        }while(!quit);
       
        System.out.println("Your Orders are:\n----------------------------\n"+order);
        System.out.println("Your total bill="+sum);
        
         System.out.println("Thank you");
    
        
        
        
    
    }
    
}
