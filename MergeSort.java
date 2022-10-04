package MergeSort;
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

        Scanner scnr2 = new Scanner(new FileReader("sorted15k.txt"));

        String list;
        
        while (scnr2.hasNext()){
            list = scnr2.next();

            listofStrings.add(list);
            
        }

       

        String[] array = listofStrings.toArray(new String[0]);
        mergeSort(array, 0, array.length - 1);
        

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        final long totalTime = System.nanoTime() - startTime;
        System.out.println("Total runtime: " + (totalTime));
    }

        public static String[] mergeSort(String[] array, int low, int high){
        //for (String eachString : array){
            if (low == high){
                String[] A = {array[low]};
                return A;
            }
            int mid = low + (high - low) / 2;
            String[] array1 = mergeSort(array, low, mid);
            String[] array2 = mergeSort(array, mid + 1, high);

            String[] array3 = merge(array1, array2);
            return array3;
        //}
    }

        public static String[] merge(String[] Arr1, String[] Arr2) {
            int arrayLength1 = Arr1.length;
            int arrayLength2 = Arr2.length;
            String[] Arr3 = new String[arrayLength1 + arrayLength2];

            int index = 0;

            int i = 0;
            int j = 0;

            while(i < arrayLength1 && j < arrayLength2){
                if (LetterCheck(Arr1[i], Arr2[j])){
                    Arr3[index] = Arr1[i];
                    i++;
                    index++;
                }
                else{
                    Arr3[index] = Arr2[j];
                    j++;
                    index++;
                }
            }
            while(i < arrayLength1){
                Arr3[index] = Arr1[i];
                i++;
                index++;
            }
            while(j < arrayLength2){
                Arr3[index] = Arr2[j];
                j++;
                index++;
            }
            return Arr3;
            
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
