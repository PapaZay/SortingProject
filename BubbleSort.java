package BubbleSort;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class main {

    public static void main(String[] args) throws IOException
    {
        final long startTime = System.nanoTime();
        String file;
        List<String> listofStrings = new ArrayList<String>();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Choose a file: ");
        file = scnr.nextLine();

        Scanner scnr2 = new Scanner(new FileReader("perm15k.txt"));

        String list;
        
        while (scnr2.hasNext()){
            list = scnr2.next();

            listofStrings.add(list);
            
        }

       

        String[] array = listofStrings.toArray(new String[0]);
        bubbleSort(array, array.length);
        

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        final long totalTime = System.nanoTime() - startTime;
        System.out.println("Total runtime: " + (totalTime));

    }

    public static void bubbleSort(String[] array, int n){
        int i, j;
        String key;
        boolean ifSwapped;
        for (i = 0; i < n -1; i++){
            ifSwapped = false;
            for(j = 0; j < n - i -1; j++){
                if (LetterCheck(array[j + 1], array[j])){
                    key = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = key;
                    ifSwapped = true;
                }
            }
            if(ifSwapped == false)
            break;

        }

        
    }

    public static boolean LetterCheck(String string1, String string2){
        string1 = string1.toUpperCase();
        string2 = string2.toUpperCase();
        if (string1.compareTo(string2) < 0){
            return true;
        }
        return false;
        }


    }
