import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class main{
    public static void main(String[] args) throws IOException
    {
        final long startTime = System.nanoTime();
        String file;
        List<String> listofStrings = new ArrayList<String>();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Choose a file: ");
        file = scnr.nextLine();

        Scanner scnr2 = new Scanner(new FileReader("sorted135k.txt"));

        String list;
        
        while (scnr2.hasNext()){
            list = scnr2.next();
            listofStrings.add(list);
            
        }

       

        String[] array = listofStrings.toArray(new String[0]);
        String key;
        int i;
        int j;
        for (String eachString : array){
            
            for(i = 0; i < array.length; i++){
                 key = array[i];
                 j = 0;
                for(j = i; j > 0; j--){
                    if(key.compareTo(array[j - 1]) < 0)
                        array[j] = array[j - 1];
                    else
                        break;
                    array[j] = key;
                    } 
                    //array[j] = array[j - 1];
                    //array[j] = key;
                    //array[j] = key;
                    //System.out.println(eachString);
                }
                //array[j + 1] = key;
                System.out.println(eachString);
                //System.out.println(Arrays.toString(array));
            }
            
            //System.out.println(eachString);
        

        
            final long totalTime = System.nanoTime() - startTime;
            System.out.println("Total runtime: " + (totalTime));
    }
    
}
