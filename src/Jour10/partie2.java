package Jour10;

import java.io.*;
import java.util.*;


public class partie2
{
    public static void main(String[] args) throws IOException 
	{
		List<Character> list = new ArrayList<>();
        List<Long> sommeCarac = new ArrayList<>();
		//On ouvre le fichier
		File doc =new File("C:\\Users\\33781\\Documents\\Pour_moi\\AdventOfCode\\src\\Jour10\\input.txt");
        Scanner ligne = new Scanner(doc);

		
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
                                            trouve=true;
                                        }
                                        break;

                            case ')':
                                        if(dernierCarac =='(')
                                        {
                                            list.remove(list.size()-1);
                                        }
                                        else 
                                        {
                                            trouve=true;
                                        }
                                        break;
                        }
                    }
               }
               else
               {
                   list.clear();
               }
            }

            if(!(list.isEmpty()))
            {
                System.out.print(list);
                Long sum = Long.valueOf(0);
                for (int y= list.size()-1; y>=0; y--)
                {
                    sum *=5;
                    switch(list.get(y))
                    {
                        case '[' : sum +=2;
                                    break;
                        case '{' : sum +=3;
                                    break;
                        case '(' : sum +=1;
                                    break;
                        case '<' : sum+=4;
                                    break;
                    }
                    System.out.println(sum);
                }
                sommeCarac.add(sum);
                System.out.println(sum);
            }
                
                
        }
        ligne.close();
        Collections.sort(sommeCarac);
        System.out.println(sommeCarac.get(sommeCarac.size()/2));

    }

        
            
    }
            
        

