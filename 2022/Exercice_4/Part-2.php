<?php
    $filePath = 'C:\Users\33781\Documents\AdventOfCode\2022\Exercice_4\input.txt';
    $handle = fopen($filePath, 'r');

    $pairs = 0;
    while(! feof($handle))  {
        $results = explode(',',fgets($handle));
        $left = explode('-',$results[0]);
        $right = explode('-',$results[1]);

        //Si $left[0]<$right[0]<left[1]
        //$left[0]<= $right[0]<= $left[1] ||$left[0]<=$right[1]<=$left[1]||$right[0]<=$left[0]<=$right[1]||$right[0]<=$left[1]<=$right[1]

        if(($left[0]<= $right[0] && $right[0] <= $left[1]) || ($left[0]<= $right[1] && $right[1] <= $left[1]) || ($right[0]<= $left[0] && $left[0] <= $right[1]) || ($right[0]<= $left[1] && $left[1] <= $right[1]))
        {
            $pairs += 1;
        }
    }
    echo $pairs;
    fclose($handle);
?>