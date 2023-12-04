<?php
    $filePath = 'C:\Users\33781\Documents\AdventOfCode\2022\Exercice_2\input.txt';
    $handle = fopen($filePath, 'r');
    
    $sommeInc = 0;
    while(! feof($handle))  {
        $result = fgets($handle);
      
        
      switch($result[2])
      {
        case "X" : $sommeInc +=1 ; if($result[0]=="A"){
                                        $sommeInc +=3;
                                    } elseif($result[0]=="C")
                                    {$sommeInc +=6;}
                                     break;

        case "Y" : $sommeInc +=2 ; if($result[0]=="A"){
            $sommeInc +=6;
        } elseif($result[0]=="B")
        {$sommeInc +=3;}
         break;

         case "Z" : $sommeInc +=3 ; if($result[0]=="B"){
            $sommeInc +=6;
        } elseif($result[0]=="C")
        {$sommeInc +=3;}
         break;
      }
    
    }
    echo $sommeInc;
    fclose($handle);
?>