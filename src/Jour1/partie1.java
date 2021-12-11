package Jour1;
import java.io.*;
import java.util.*;

public class partie1 {

    public static void main(String[] args) throws IOException 
    {
        List<Integer>list = new ArrayList<>();
		//On ouvre le fichier
		File doc =new File("C:\\Users\\33781\\Documents\\Pour_moi\\AdventOfCode\\src\\Jour1\\input.txt");
        Scanner ligne = new Scanner(doc);
        while (ligne.hasNextInt())
        {
            list.add(ligne.nextInt());
        }
        int somme = 0;
        for (int i=0; i<list.size() ; i++)
        {

            if(list.get(i-1)<list.get(i))
            {
                somme ++;
            }
        }
        ligne.close();
        System.out.println(somme);
    }
}
