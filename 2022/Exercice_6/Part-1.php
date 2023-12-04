<?php

    $filePath = 'C:\Users\33781\Documents\AdventOfCode\2022\Exercice_6\input.txt';
    $handle = fopen($filePath, 'r');
    $line = fgets($handle);

    for($i =0;$i<strlen($line)-4;$i++)
    {
        if($line[$i] != $line[$i+1] && $line[$i] != $line[$i+2] && $line[$i] != $line[$i+3] && $line[$i+1] != $line[$i+2] && $line[$i+1] != $line[$i+3] && $line[$i+2] != $line[$i+3])
        {
            echo $i+4;
            break;
        }
    }
?>