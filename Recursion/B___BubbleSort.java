public class B___BubbleSort {    public static void main(String[] args) {        int arr[]={7,6,9,4,11,2,5};        int i=0,j=0;        for(i=0;i<arr.length-1;i++) {            for (j = 0; j < arr.length - i-1; j++) {                if (arr[j] > arr[j + 1]) {                    int t = arr[j + 1];                    arr[j + 1] = arr[j];                    arr[j] = t;                }            }        }        for(i=0;i<arr.length;i++)        {            System.out.println(arr[i]);        }    }}