/*Dato un numero compreso tra 1 e 4 , generare una serie di sottoprocessi
tramite un ciclo for, per ogni processo stampare pid del padre e il proprio*/
#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

int main(){
        pid_t pid;
        int n,i;
        do{
                printf("inserire un numero compreso tra 1 e 4");
                scanf("%d",&n);
        }while((n<1)||(n>4));
        printf("sono il padre%d e sto per generare i miei figli\n",getpid());
        for(i=0;i<n;i++){
        pid=fork();
        if(pid==0){
        sleep(1);
        printf("\n sono il figlio %d del padre %d ", getpid(),getppid());
                }
        }
}
~
