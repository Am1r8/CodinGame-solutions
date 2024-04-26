#include <stdlib.h>
#include <stdio.h>
#include <string.h>
 

struct pair { char *ext; char *mime; };
struct dict {
    int size;
    struct pair *elmts;
};
char *assoc (struct dict *d, char *ext) {
    for (int i = 0; i < d->size; i++)
        if (strcmp(d->elmts[i].ext, ext) == 0)
            return d->elmts[i].mime;
    return "UNKNOWN";
}
void toLower (char *str) {
    for (; *str != '\0'; str++)
        *str = tolower(*str);
}
char *getExt (char *str) {
    for (char *ext = str+strlen(str); ext != str; ext--)
        if (*(ext-1) == '.')
            return ext;
    return NULL;
}
int main(int argc, char** argv)
{
    int dictSize, nbFiles;
    scanf("%d\n%d\n", &dictSize, &nbFiles);

    struct dict d;
    struct pair *p;
    d.size = dictSize;
    d.elmts = malloc(d.size*sizeof(struct pair));
    for (int i = 0; i < dictSize; i++) {
        p = d.elmts+i;
        p->ext = malloc(11*sizeof(char));
        p->mime = malloc(51*sizeof(char));
        scanf("%s %s\n", p->ext, p->mime);
        toLower(p->ext);
    }
    char file[257];
    char *ext;
    for (int i = 0; i < nbFiles; i++) {
        gets(file);
        toLower(file);
        ext = getExt(file);
        printf("%s\n", assoc(&d, ext?ext:""));
    }
 
    for (int i = 0; i < dictSize; i++) {
        p = d.elmts+i;
        free(p->ext);
        free(p->mime);
    }
    free(d.elmts);
 
    return EXIT_SUCCESS;
}