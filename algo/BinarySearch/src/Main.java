
// This algorithm is meant to find a value in array typed by user using binary search algorith
//
// This algorithm require sorted array of values

// What is a Binary search?
//
//A binary search is a search in which the middle element is calculated to check whether it is smaller or larger than
//the element which is to be searched. The main advantage of using binary search is that it does not scan each element
//in the list. Instead of scanning each element, it performs the searching to the half of the list. So, the binary
//search takes less time to search an element as compared to a linear search.
//The one pre-requisite of binary search is that an array should be in sorted order, whereas the linear search works on
//both sorted and unsorted array. The binary search algorithm is based on the divide and conquer technique, which means
//that it will divide the array recursively.

//source: https://www.javatpoint.com/ds-linear-search-vs-binary-search

import java.util.Scanner;


public class Main {
    void generate( int[] arr){
        for (int size:arr)
        {
            arr[size] =(int) Math.random();
        }

    }



    private static java.util.Scanner Scanner;
    int size;
    
    public static void main(String[] args) {
        int size = 0;
        int[]   MyArray;

        System.out.println("HI I am binary search algorithm! ");
        System.out.println("here you will see my generated array of Int type values: ");

        System.out.println("now you can tell me what value you want me to find. I will show you how many steps it takes me to find your value !  ");
        System.out.print("How many Int my array should have? Please give me an inteeger value :");
        Scanner scan= new Scanner( System.in);
        size = scan.nextInt();

        MyArray = new int[size];
        MyArray[0] =0;
        MyArray[1] =1;
        MyArray[2] =2;
        MyArray[3] =3;
//generator funciotn

    }
}