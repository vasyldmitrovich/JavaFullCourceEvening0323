package com.softserve.edu05.pt;

public class Task3 {
    public static int max(int []arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]>max ){
           max= arr[i];
        }
        }
        return max;
    }
    public static int CountNumber( int []arr){
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0 ){
                k++;
            }
        }
        return k;
    }
    public static void NegativePositive(int []arr){
        int k=0,k1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0 ){
                k++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 ){
                k1++;
            }
        }
       if(k>k1){
           System.out.println("There are more negative values in the array");
       }
       if(k<k1){
            System.out.println("There are more positive values in the array");
        }
       if(k==k1){
           System.out.println("There are an equal number of positive and negative values in the array.");
       }


    }
    public static int sum(int []arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 ){
                sum=arr[i]+sum;
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int Array[] = new int[10];// масиви

        /*Where is two spaces before loop  for(int */
for(int i=0;i<Array.length;i++) {
    int a = (int) (Math.random() *(200+1)) - 100;
    Array[i]=a;
         }

/*Add space of comment between different logic*/
        int MAX=max(Array);
        int SUM=sum(Array);
        int NegativNumbers= CountNumber(Array);


        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
        System.out.println("Max is "+MAX);
        System.out.println("Sum is "+SUM);
        System.out.println("Negativ Numbers "+NegativNumbers);
        NegativePositive(Array);


    }
}
