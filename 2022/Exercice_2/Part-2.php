<?php
    $filePath = 'C:\Users\33781\Documents\AdventOfCode\2022\Exercice_2\input.txt';
    $handle = fopen($filePath, 'r');
    
    $sommeInc = 0;
    while(! feof($handle))  {
        $result = fgets($handle);
      
        
      switch($result[2])
      {
        //On doit faire exprès de perdre donc s'il prend Pierre, on doit prendre Ciseau
        case "X" :  if($result[0]=="A"){
                        $sommeInc += 3;
                    }
                    elseif($result[0]=="B"){
                        $sommeInc += 1;
                    }
                    else{
                        $sommeInc += 2;
                    }
                    break;

        //On cherche à égaliser. S'il prend Feuille, on prend Feuille
        case "Y" : $sommeInc += 3; 
                    if($result[0]=="A"){
                        $sommeInc +=1;
                    } 
                    elseif($result[0]=="B"){
                        $sommeInc +=2;
                    }
                    else{
                        $sommeInc += 3;
                    }
                    break;

        //On doit ABSOLUMENT gagner. S'il prend Ciseau, on prend Pierre
         case "Z" : $sommeInc +=6 ; 
                    if($result[0]=="A"){ //Il prend Pierre
                        $sommeInc +=2;  //Je prend Feuille
                    } 
                    elseif($result[0]=="B"){ //Il prend Feuille
                        $sommeInc +=3; //Je prend Ciseau
                    }
                    else{
                        $sommeInc +=1; //Il prend ciseau, je prend Pierre
                    }
                    break;
      }

    }
    echo $sommeInc;
    fclose($handle);
