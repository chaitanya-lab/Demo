/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.util.*;
package quicksort;
import java.util.*;
/**
 *
 * @author chaitanya
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[]={15,16,9,5,3,6,16,34};
        int len=arr.length;
        QuickSort qs=new QuickSort();
        qs.QuickSortRecursion(arr,0,len-1);
        qs.PrintArray(arr);
    }
     int Partion(int arr[],int low,int high){
        int pivot=arr[(low+high)/2];
        while(low<=high){
            while(low<=high){
                while(arr[low]<pivot){
                    low++;
                }
                while(arr[high]>pivot){
                    high--;
                }
               if(low<=high){
                    int temp=arr[low];
                    arr[low]=arr[high];
                    arr[high]=temp;
                    low++;
                    high--;
                }
            }
        }
        return low;
    }
     void QuickSortRecursion(int arr[],int low,int high){
        int pi=Partion(arr,low,high);
        if(low<pi-1){
            QuickSortRecursion(arr,low,pi-1);
        }
        if(pi<high){
            QuickSortRecursion(arr,pi,high);
        }
    }
     void PrintArray(int arr[]){
        for(int i : arr){
            System.out.print(i);
        }
        
    }
    
    
}
