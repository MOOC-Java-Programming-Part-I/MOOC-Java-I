

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        int searching = scanner.nextInt();
        System.out.println("");
        // Implement the search functionality here
        boolean isFound = false;
        int foundIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == searching){
                isFound = true;
                foundIndex = i;
                break;
            }
        }
        
        if(isFound)System.out.println(searching + " is at index " + foundIndex + ".");
        else System.out.println(searching + " was not found.");
    }

}
