package Jour2;
import java.io.*;
import java.util.*;

public class partie2 
{
    public static void main(String[] args) throws IOException
    {
        List<String> direction = new ArrayList<>();
        List<Integer> valeur = new ArrayList<>();
        File doc = new File("C:\\Users\\33781\\Documents\\Pour_moi\\AdventOfCode\\src\\Jour2\\input.txt");
        Scanner ligne = new Scanner(doc);
        int x =0;
        int y = 0;
        long depth=0;
        while (ligne.hasNextLine())
        {
            //Permet de separer la ligne en 2
            StringTokenizer bout = new StringTokenizer(ligne.nextLine());
            direction.add(bout.nextToken());
            valeur.add(Integer.parseInt(bout.nextToken()));
        }
        
        for(int i=0; i<direction.size(); i++)
        {
            switch(direction.get(i))
            {
                case "forward": x+=valeur.get(i); depth+= valeur.get(i)*y; break;
                case "up": y-=valeur.get(i);break;
                case "down": y+=valeur.get(i);break;
            }
            System.out.println("Au tour "+i+ " x vaut : "+x + " y vaut : " + y + " et depth :" + depth);
        }

        ligne.close();
        System.out.println(x*depth);
    }
}
