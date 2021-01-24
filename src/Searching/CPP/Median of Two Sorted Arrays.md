# Practice
[Practice Link](https://www.geeksforgeeks.org/median-of-two-sorted-arrays-of-different-sizes/)

Given two sorted arrays array1 and array2 of size m and n respectively. Find the median of the two sorted arrays.

## Input:
First line of input contains number of testcases T. For each testcase, there will be two lines. First line will contain m followed by m space separated integers for array1. Second line will contain n followed by n space separated integers for array2. 

## Output:
Print the median of the two sorted arrays.

## User Task:
The task is to complete the function MedianOfArrays() that takes array1 and array2 as input and returns their median. 

## Expected Time Complexity: O(min(log n, log m)).
## Expected Auxiliary Space: O(1).

##Constraints: 
1 <= T <= 200
0 <= m,n <= 10000
1 <= array1[i], array2[i] <= 10^5

## Example:
### Input:
2
3 1 5 9
4 2 3 6 7
2 4 6
4 1 2 3 5

### Output:
5
3.5

### Explanation:
Case 1: The middle element for {1,2,3,5,6,7,9} is 5
Case 2: The middle 2 elements for {1,2,3,4,5,6} are 3 and 4 and their average is 3.5

## - First Approach
`````cpp
double MedianOfArrays(vector<int>& arr1, vector<int>& arr2)
{
    
    int i=0,j=0;
    int n=arr1.size(),
    m=arr2.size();
    
    int count=0;
    
    int m1=0,m2=0;
    
    for(count=0;count<=((m+n+1)/2);count++)
    { 
        m2=m1;
        if(i<n&&j<m)
        {
            if(arr1[i]<arr2[j])
                m1=arr1[i++];
            else
                m1=arr2[j++];
        }
        else if(i<n)
            m1=arr1[i++];
        else
            m1=arr2[j++];
    }
    
    double ans;
    if((m+n)%2==1)
    {
        ans=m2;
    }
    else{
        ans=((m2+m1)/2.0);
    }

return ans;
}
``````
## - Second Approach
`````cpp
double MedianOfArrays(vector<int>& arr1, vector<int>& arr2)
{
    vector<int> temp;
    int i=0,j=0;
    int n=arr1.size(),m=arr2.size();
    
    while(i<n&&j<m)
    {
        if(arr1[i]<arr2[j])
        {
            temp.push_back(arr1[i++]);
        }
        else{
            temp.push_back(arr2[j++]);
        }
    }
    
    while(i<n)
    {
        temp.push_back(arr1[i++]);
    }

    while(j<m)
    {
        temp.push_back(arr2[j++]);
    }
    
    double ans;
    if(temp.size()%2==1)
    {
        ans=temp[(temp.size()-1)/2];
    }
    else{
        ans=(temp[(temp.size()-1)/2]+temp[(temp.size())/2]);
        ans=(ans/2);
    }

return ans;
}
``````
