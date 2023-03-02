package ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static public void printArr(String[] arr) {
        for (String element: arr
        ) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String in_file = "src\\ex1\\judete_in.txt";
        BufferedReader br = new BufferedReader(new FileReader(in_file));

        String line;
        String[] judete = new String [42];

        int k = 0;  // counter

        while ((line = br.readLine()) != null) {
            judete[k] = line;
            k++;
        }

        // sortare tablou
        Arrays.sort(judete);

        // afisare tablou sortat
        System.out.println("\nTablou sortat de judete:\n");
        printArr(judete);

        // cautare judet
        System.out.println("\nIntroduceti judetul cautat: ");
        String judet_cautat = scanner.nextLine();

        Integer key = Arrays.binarySearch(judete, judet_cautat);
        System.out.println("\nIndexul judetului cautat: " + key);

        br.close();
        scanner.close();
    }
}