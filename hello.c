// DFS (Depth First Search)

#include<stdio.h>

int graph[4][4] = {
    {0,1,1,0},
    {1,0,1,1},
    {1,1,0,0},
    {0,1,0,0}
};

int visited[4] = {0};

void DFS(int node){
    visited[node] = 1;
    printf("%d ", node);

    for(int i = 0; i< 4; i++){
        if(graph[node][i] == 1 && !visited[i]){
            DFS(i);
        }
    }
}
int main(){
    printf("DFS Traversal : ");
    DFS(0);

    return 0;
}