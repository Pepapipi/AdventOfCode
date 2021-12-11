package Jour2;
import java.io.*;
import java.util.*;

public class partie1 
{
    public static void main(String[] args) throws IOException
    {
        File doc = new File("C:\\Users\\33781\\Documents\\Pour_moi\\AdventOfCode\\src\\Jour2\\input.txt");
        Scanner ligne = new Scanner(doc);
        int x =0;
        int y = 0;
        while (ligne.hasNextLine())
        {
            //Permet de separer la ligne en 2
            StringTokenizer bout = new StringTokenizer(ligne.nextLine());
            String direction = bout.nextToken();
            int valeur = Integer.parseInt(bout.nextToken()); 
            
            switch(direction)
            {
                case "forward": x+=valeur; break;
                case "up": y-=valeur;break;
                case "down": y+=valeur;break;
            }
        }
        ligne.close();
        System.out.println(x*y);
    }
}
