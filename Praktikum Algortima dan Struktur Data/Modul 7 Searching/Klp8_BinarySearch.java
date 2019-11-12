package algodatp7;

import java.util.Scanner;

public class AlgodatP7_J1_BinarySearch 
{
    static int i;
    static int arr[];
    public static int binarySearch(int arr[], int l, int r, int x) 
    {
        if (r >= 1) 
        {
                int mid = l + (r - l) / 2;
                if (arr[mid] == x) 
                {
                    return mid;
                }
                if (arr[mid] > x) 
                {
                    return binarySearch(arr, l, mid - 1, x);
                }
                return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
    
    public static int[] input()
    {
        Scanner masukan = new Scanner(System.in);
        System.out.println("----------------INPUT NILAI ARRAY----------------");        
        arr= new int[22];
        for (i=0;i<22;i++)
        {
            System.out.print("Masukkan nilai index ke-"+i+" : ");
            arr[i]=masukan.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) 
    {
        AlgodatP7_J1_BinarySearch.input();
        int n = arr.length;
        int x = 21;
        int result = AlgodatP7_J1_BinarySearch.binarySearch(arr, 0, n - 1, x);
        System.out.println("-----------------HASIL PENCARIAN-----------------");
        if (result == -1) 
        {
            System.out.println("Elemen tidak ditemukan");
        } 
        else 
        {
            System.out.println("Elemen ditemukan pada index " + result);
        }
    }
} 
