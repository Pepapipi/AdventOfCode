<?php
    $filePath = 'C:\Users\33781\Documents\AdventOfCode\2022\Exercice_1\input.txt';
    $handle = fopen($filePath, 'r');
    
    $sommeMax = 0;
    $sommeInc = 0;
    while(! feof($handle))  {
        $result = intval(fgets($handle));
        if($result != 0)
        {
            $sommeInc += $result;
        }
        else
        {
            if($sommeMax < $sommeInc) $sommeMax = $sommeInc;
            $sommeInc = 0;
        }
      }
      echo $sommeMax;
    fclose($handle);
?>
