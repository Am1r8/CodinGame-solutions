while (true) {
    var hh = 0;
    var mf = 0;
    for (var i = 0; i < 8; i++) {
        var mh = parseInt(readline());
        if (hh < mh) {
            hh = mh;
            mf = i;
            }
    }
    print(mf);
}