#include <stdio.h>

void main(int) {
    int i=0, j=0, k;
    for(;i<3;i++) {
        for(j=0; j<=i; j+=2) {
            for(k='A'; k<= 'A'+i+j; k++){
                printf("%c",k);
            }
        }
        printf("\n");
    }
}
