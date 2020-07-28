# Practice 
[Practice Link](https://practice.geeksforgeeks.org/problems/overlapping-intervals/0)

Given a collection of Intervals, the task is to merge all of the overlapping Intervals.
## Input:
First line of input contains number of testcases T. For each testcase, there will be two lines, first of which contains an integer N depicting the number of intervals. The second line contains the N interval's starting and ending positions 'x' and 'y' respectively.

## Output:
Print the resultant list of pairs in sorted order after merging overlapping intervals. 

## Your Task:
Complete the function overlappedInterval() that takes the list of pairs and N as input parameters and returns sorted list of pairs of intervals after merging.

### Expected Time Complexity: O(N*Log(N) ).
### Expected Auxiliary Space: O(1).

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 100
0 ≤ x ≤ y ≤ 1000

### Example:
#### Input:
2
4
1 3 2 4 6 8 9 10
4
6 8 1 9 2 4 4 7

Output:
1 4 6 8 9 10
1 9

Explanation:
Testcase 1: Given intervals: [1,3], [2,4], [6,8], [9,10], we have only two overlapping intervals here, [1,3] and [2,4]. Therefore, we will merge these two and return [1,4], [6,8], [9,10].

````cpp
//First Approach
vector<pair<int,int>> overlappedInterval(vector<pair<int,int>> vec, int n) {
    
    sort(vec.begin(),vec.end());
    vector<pair<int,int>>::iterator it1= vec.begin();
    vector<pair<int,int>>::iterator it2;
    
    it2=it1+1;
    
    
    while(it1!=vec.end())
    {
        if(it1->second<it2->first)
        {
            it1++;
            if(it1!=vec.end())
            it2++;
            else
            break;
        }
        else{
            if(it2==vec.end())
                break;
            
            it1->second=max(it2->first,max(it1->second,it2->second));
            vec.erase(it2);
            it2=it1+1;
            if(it2==vec.end())
            break;
        }
    }
    return vec;
}
`````
```cpp
// Second Approach
bool comp(pair<int,int> x, pair<int,int> y){
if(x.first < y.first)
    return 1;
if(x.first > y.first)
    return 0;
if(x.second < y.second)
    return 1;
return 0;
}
vector<pair<int,int>> overlappedInterval(vector<pair<int,int>> vec, int n) 
{
    int index = 0,i;
    sort(vec.begin(),vec.end(),comp);
    vector<pair<int,int>> v;
    int j=0;
    for(i=1;i<n;i++)
    {
        if(vec[index].second>=vec[i].first)
        {
            vec[index].second = max(vec[index].second,vec[i].second);
            vec[index].first = min(vec[index].first,vec[i].first);
        }
        else
        {
            index++;
            vec[index] = vec[i];
        }
    }
     vector<pair<int,int>> ::iterator itr,itr1;
     itr = vec.begin();
     itr1 = vec.end();
     for(i=0;i<=index;i++)
     {
         itr++;
     }
     vec.erase(itr,itr1);
    return vec;
}
```
