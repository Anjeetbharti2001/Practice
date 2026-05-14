// BFS(Breadth first search)

#include<stdio.h>

int graph[4][4] = {
    {0,1,1,0},
    {1,0,1,1},
    {1,1,0,0},
    {0,1,0,0}
};

int visited[4] = {0};
void BFS(int start){
    int queue[10];
    int front = 0, rear = 0;

    visited[start] = 1;
    queue[rear++] = start;
while(front < rear){
    int current = queue[front++];
    printf("%d", current);

    for(int i = 0; i<4; i++){
        if(graph[current][i] == 1 && !visited[i]){
            visited[i] = 1;
            queue[rear++] = i;
        }
    }
}

}

int main(){
    printf("BFS Traversal : ");
    BFS(0);
    return 0;
}