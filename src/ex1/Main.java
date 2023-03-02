package ex1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    String[] judete= readJudeteFromFile("judete_in.txt");
    Arrays.sort(judete);

    Scanner scanner = new Scanner(System.in);
    System.out.print("Introduceti judetul: ");
    String judetCautat=scanner.nextLine();


}
