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
    for(int i = 0; i<4; i++){
        if(graph[node][i] == 1 && !visited[i]){
            DFS(i);
        }
    }
}
int main(){
    int start = 0;
    int end = 3;

    DFS(start);
    if(visited[end])
    printf("Path Exists");
    else
       printf("No Path");

       return 0;
}