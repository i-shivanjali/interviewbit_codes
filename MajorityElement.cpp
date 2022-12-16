/*
Given an array of size N, find the majority element. The majority element is the element that appears more than floor(N/2) times.
You may assume that the array is non-empty and the majority element always exist in the array.
*/


//CODE
int Solution::majorityElement(const vector<int> &A) {
int n=A.size();
int N=floor(n/2);
int count=0;
for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
        if (A[i]==A[j]){
            count+=1;
        }
        else 
            continue;
    }
if (count >= N){
        return A[i];
    }
else 
        count=0; 
}
}
