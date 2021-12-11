package Jour10;

import java.io.*;
import java.util.*;

public class partie1 
{
    public static void main(String[] args) throws IOException 
	{
		List<Character> list = new ArrayList<>();

		//On ouvre le fichier
		File doc =new File("C:\\Users\\33781\\Documents\\Pour_moi\\AdventOfCode\\src\\Jour10\\input.txt");
        Scanner ligne = new Scanner(doc);

		int somme = 0;
        while (ligne.hasNextLine())
        {
            list.clear();
            char[] digits = ligne.nextLine().toCharArray();
            boolean trouve = false;
            for (char c:digits)
            {
                if (trouve == false)
                {
                    if (c=='{'|| c=='['||c=='<'|| c=='(')
                    {
                        list.add(c);
                    }
                    else
                    {
                        char dernierCarac = list.get(list.size()-1);
                        switch (c)
                        {
                            case ']': 
                                        if (dernierCarac == '[')
                                        {
                                            list.remove(list.size()-1);
                                        }
                                        else
                                        {
                                            somme +=57;
                                            trouve = true;  
                                        }
                                        
                                        break;

                            case '}':
                                        if (dernierCarac == '{')
                                        {
                                            list.remove(list.size()-1);
                                        }
                                        else
                                        {
                                            somme +=1197;
                                            trouve = true;
                                        }
                                        break;

                            case '>': 
                                        if(dernierCarac =='<')
                                        {
                                            list.remove(list.size()-1);
                                        }
                                        else
                                        {
                                            somme += 25137;
                                            trouve = true;
                                        }
                                        break;

                            case ')':
                                        if(dernierCarac =='(')
                                        {
                                            list.remove(list.size()-1);
                                        }
                                        else
                                        {
                                            somme +=3;
                                            trouve = true;
                                        }
                                        break;
                        }
                }   }
            }

        }
        System.out.println(somme);
            
    }
            
        
}
