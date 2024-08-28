//import stuff here

//Your code here
 
//import stuff here
import java.util.Scanner;
import java.lang.Math.*; 

//Your code here

public class Program7{
    //Define your final variables here
    // **HINT: Maybe the conversion rates?????**

    public static void main(String[] args){
        //Make you own test code here
        Scanner scanner = new Scanner(System.in);

        Program7 tester = new Program7();
        
        System.out.println("Enter schrute-bucks: ");
        int schrutebucks = scanner.nextInt();
        
        System.out.println("Enter klevins: ");
        int klevins = scanner.nextInt();
        
        System.out.println("Enter stanley-nickels: ");
        int stanleynickels = scanner.nextInt();
        
        double myTestVal = 0.0;
        
        myTestVal = tester.convertMoney(schrutebucks,stanleynickels,klevins);
        
        System.out.println("Decimal schrute-bucks = $" + myTestVal);

        
    }
    
    
    
    public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
        //implement a function that converts from the old format to the new format
        
        final double klevinsConveration = (double) klevins/20; 
        
        final double stanleyNickelsConveration = (double) stanleyNickels/240; 
        
        double total = klevinsConveration + stanleyNickelsConveration + schruteBucks ; 
        
        total = (double) Math.round(total * 100.0)/100.0; 
        
        


        
        return total; 
        
        
    }
}
    
    


//Paste console output below:
/*
Enter schrute-bucks: 
7
Enter klevins: 
17
Enter stanley-nickels: 
9
Decimal schrute-bucks = $7.89

*/
