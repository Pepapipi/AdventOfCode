package Jour4;
import java.io.*;
import java.util.*;

public class partie1 {

    public static void main(String[] args) throws IOException
    {
        List<Integer> numeroSortie = new ArrayList<>();
        File doc = new File("C:\\Users\\33781\\Documents\\Pour_moi\\AdventOfCode\\src\\Jour4\\input.txt");
        BufferedReader ligne = new BufferedReader(new FileReader(doc));

        String laLigne = ligne.readLine();
        String[] numero =laLigne.split(",");

        //On récupère le numéro de sortie des nombres
        for(String c:numero)
        {
            numeroSortie.add(Integer.parseInt(c));
        }

        
        
        
        
    }
    
}
