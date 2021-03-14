import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberInBag {
    public static void main(String[] args) {
    
    //Input number In bag
    Scanner input = new Scanner(System.in);  
    System.out.println("Enter element in bag: ");
    String data = input.nextLine(); 
    int n = Integer.parseInt(data);


    //Remove one Number in Bag
    Scanner inputMissing = new Scanner(System.in);  
    System.out.println("Enter element Missing in bag: ");
    String dataMissing = inputMissing.nextLine(); 
    int Missing = Integer.parseInt(dataMissing);


    //Create Bag
    ArrayList<Integer> number = new ArrayList<Integer>();
    
    //Add number in Bag 
    for(int i=1; i<=n; i++)
    {
        if(i != Missing)
            number.add(i);
    }


    //Find Missing Number 
    int tmp = (Missing + 1)*(Missing + 2) / 2;
    for(int i=0; i < Missing; i++)
    {
        tmp = tmp - number.get(i);
    }

    //Show Out put
    System.out.println("This is Bag: "+ number);
    System.out.println("This is Missing number: "+tmp);

    }


    //Ref. https://www.geeksforgeeks.org/find-the-missing-number/
}
