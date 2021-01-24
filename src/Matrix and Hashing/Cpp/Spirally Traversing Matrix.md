# Spirally traversing a matrix 
## (practice Link)[https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix/0]
Given a matrix mat[][] of size M*N. Traverse and print the matrix in spiral form.

### Input:
The first line of the input contains a single integer T, denoting the number of test cases. Then T test cases follow. Each testcase has 2 lines. First line contains M and N respectively separated by a space. Second line contains M*N values separated by spaces.

### Output:
Elements when traveled in Spiral form, will be displayed in a single line.

### Your Task:
This is a function problem. You only need to complete the function spirallyTraverse that takes m, n, and matrix as parameters and prints the spiral traversal. The driver code automatically appends a new line.

### Expected Time Complexity: O(N*M)
### Expected Auxiliary Space: O(1)

### Constraints:
1 <= T <= 100
2 <= M, N <= 100
0 <= Ai <= 100

Example:
Input:
2
4 4
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
3 4
1 2 3 4 5 6 7 8 9 10 11 12
Output:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
1 2 3 4 8 12 11 10 9 5 6 7

````cpp
void spirallyTraverse(int rows, int col, int ar[SIZE][SIZE]){
    int rs=0,re=rows-1;
    int cs=0,ce=col-1;
    
    while(rs<=re&&cs<=ce)
    {
        for(int i=cs;i<=ce;i++)
            cout<<ar[rs][i]<<" ";
            
        rs++; 
        
        for(int i=rs;i<=re;i++)
            cout<<ar[i][ce]<<" ";
        
        ce--;
        
        if(rs>re||cs>ce)
            break;
        
        for(int i=ce;i>=cs;i--)
            cout<<ar[re][i]<<" ";
        
        re--;    
        if(rs>re||cs>ce)
            break;
        
        for(int i=re;i>=rs;i--)
            cout<<ar[i][cs]<<" ";
            
        cs++;
    }

    
    
}
`````
