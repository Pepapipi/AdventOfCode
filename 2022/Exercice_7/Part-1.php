<?php

    $filePath = 'C:\Users\33781\Documents\AdventOfCode\2022\Exercice_7\input.txt';
    $handle = fopen($filePath, 'r');

    while(! feof($handle))  {
        $line = fgets($handle);
        echo $line;
    }
?>