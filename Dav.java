import java.util.Scanner;
import java.util.ArrayList;


//6135512026 Jaturon Moonjan

//Usage: java Dav <number of d>  ---> 2^d

class Dav{
    public static void main(String[] args) {

    /*
    Scanner inputD = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter number of D: ");
    String data = inputD.nextLine();  // Read user input
    int d = Integer.parseInt(data);
    System.out.println("value of D is : "+d);  // Output user input
    */

    if(args.length < 1)
    {
        System.out.println("Usage: java Dav <number>");
    }
    else
    {
        //Get value d from user 
        int d = Integer.parseInt(args[0]);
        //Initial number 
        String number = "0";
        System.out.println("Hello, I'm Jaturon 6135512026");
        System.out.println(DavisonSequence(d,number));
    }
    
  
    }

    public static String DavisonSequence (int d, String number){
        
        
        if(d == 0){
            return number;
        }
        else{
            //Show Old Number
            System.out.println(number);
            //Toggle
            char[] toggleNumber = number.toCharArray();
            for(int i = 0; i<number.length() ; i++)
            {
                //Check Number 0?
                if(toggleNumber[i] == '0')
                {
                    //Toggle from 0 to 1
                    toggleNumber[i] = '1';
                }
                else
                {
                    //Toggle from 1 to 0
                    toggleNumber[i] = '0';
                }

            }
            //Get value from Char ---> Pass to String
            String tmp = String.valueOf(toggleNumber);
            //Connext Data old Data + New Data 
            number = number.concat(tmp);
            
        }    
        //2^d -> Round of Program 
       return DavisonSequence(d-1,number);
    }
}



