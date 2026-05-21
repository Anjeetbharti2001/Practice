#include<stdio.h>

#define V 4 

int graph[V][V] = {
    {0, 1, 1, 0},
    {0, 0, 1, 0},
    {0, 0, 0, 1},
    {0, 0, 0, 0}
};

int visited[V];
int recStack[V];

int isCyclic(int v){
    visited[v] = 1;
    recStack[v] = 1;

    for(int i = 0; i< v; i++){
        if(graph[v][i]){
            if(!visited[i] && isCyclic(i))
            return 1;
            else if (recStack[i])
            return 0;
        }
        int main(){
            int cycle = 0;
            for(int i = 0; i< v; i++){
                if(!visited[i]){
                    if(isCycle(i)){
                        cycle = 1;
                        break;
                    }
                }
            }
            if(cycle){
                printf("Graph is Cyclic");

            }else{
                printf("graph is Acyclic ");
            }
            return 0;
            
        }
    }
}