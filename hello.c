// count number of edges 

#include<stdio.h>
int main(){
    int graph[3][3] = {
        {0,1,1},
        {1,0,1},
        {1,1,0}
    };
    int edges = 0;

    for(int i = 0; i<3; i++){
        for(int j = 0; j<3; j++){
            if(graph[i][j] == 1)
            edges++;
        }
    }
    edges = edges / 2;
    printf("Total Edges = %d", edges);
    return 0;
}