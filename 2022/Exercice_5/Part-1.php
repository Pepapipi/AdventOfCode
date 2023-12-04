<?php
    $filePath = 'C:\Users\33781\Documents\AdventOfCode\2022\Exercice_5\input.txt';
    $handle = fopen($filePath, 'r');
    $array1=array("Z","T","F","R","W","J","G");
    $array2=array("G","W","M");
    $array3=array("J","N","H","G");
    $array4 = array("J","R","C","N","W");
    $array5 = array("W","F","S","B","G","Q","V","M");
    $array6 = array("S","R","T","D","V","W","C");
    $array7 = array("H","B","N","C","D","Z","G","V");
    $array8 = array("S","J","N","M","G","C");
    $array9 = array("G","P","N","W","C","J","D","L");

    $array = array($array1,$array2,$array3,$array4,$array5,$array6,$array7,$array8,$array9);

    while(! feof($handle))  {
        $results = explode(' ',fgets($handle));
        $nb_container = intval($results[1]);
        $containerFrom = intval($results[3])-1;
        $containerTo= intval($results[5])-1;

        
        $exploded = array_splice($array[$containerFrom],-$nb_container);
        

        $exploded = array_reverse($exploded);
        

        $array[$containerTo] = array_merge($array[$containerTo],$exploded);

    }
    foreach($array as $ar)
    {
        echo array_pop($ar);
    }
    fclose($handle);
?>