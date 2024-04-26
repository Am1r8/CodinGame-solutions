#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <float.h>
 
struct defib { char* name; double lon; double lat; };
double distance(double longa, double lata, double longb, double latb){
    double x = (longb-longa)*cos((lata+latb)/2);
    double y = latb - lata;
    return (sqrt(x*x+y*y) * 6371.0);
}

double td(char *str) {
    for(char *iter = str; *iter != '\0'; iter++)
        if (*iter == ',')
            *iter = '.';
    return atof(str);
}

char *gtn(char c, char *str) {
    for(; *str != c; str++);
    return str;
}

void gd(char *str, struct defib *res) {
    str = gtn(';', str);
    res->name = ++str;
    for (int k = 0; k < 3; k++) {
        str = gtn(';', str);
        *str = '\0';
        str++;
    }
    char *lon = str;
    str = gtn(',', str);
    *str = '.';
    str = gtn(';', str);
    char *lat = ++str;
    str = gtn(',', str);
    *str = '.';
    res->lon = atof(lon);
    res->lat = atof(lat);
}
 
int main(int argc, char** argv)
{
    char strLon[50];
    char strLat[50];
    int N;
    scanf("%s\n%s\n%d\n", strLon, strLat, &N);
    double lon = td(strLon);
    double lat = td(strLat);
    double min = DBL_MAX;
    char output[100];
    double d;
    char line[256];
    struct defib res;
    for (int i = 0; i < N; i++) {
        gd(fgets(line, 256, stdin), &res);
        d = distance(lon, lat, res.lon, res.lat);
        if (d < min) {
            min = d;
            strcpy(output, res.name);
        }
    }
    printf("%s", output);
    return EXIT_SUCCESS;
}