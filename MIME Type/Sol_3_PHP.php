<?php
$map = array();
fscanf(STDIN, "%d",$N);
fscanf(STDIN, "%d",$Q);

for ($i = 0; $i < $N; $i++) {
    fscanf(STDIN, "%s %s", $EXT, $MT);
    $map["." . strtolower($EXT)] = $MT;
}

for ($i = 0; $i < $Q; $i++) {
    $FNAME = stream_get_line(STDIN, 2000, "\n");
    $t = strrchr(strtolower($FNAME), ".");
    echo isset($map[$t]) ? $map[$t] : 'UNKNOWN', "\n";
}