
package com.mycompany.searching;

class Sentinel{ 
    static void sentinelSearch(int arr[], int n, int x)  {  
        
        int last = arr[n - 1];  
      
        arr[n - 1] = x;  
        int i = 0;  
      
        while (arr[i] != x)  
            i++;  
      
        arr[n - 1] = last;  
      
        if ((i < n - 1) || (x == arr[n - 1]))  
            System.out.println(x + " is present at index " + i);  
        else
            System.out.println("Not found");  
    }  
    
    public static void main (String[] args) 
    {  
        int arr[] = { 10, 20, 180, 30, 60,  
                         50, 110, 100, 70 };  
        int n = arr.length;  
        int x = 180;  
  
        sentinelSearch(arr, n, x);  
    }  
} 
