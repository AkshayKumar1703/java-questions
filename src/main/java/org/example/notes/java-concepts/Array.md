# Array

### What is an Array?
An array is the simplest data structure where a collection of similar data elements takes place and each data element can be accessed directly by only using its index number.

### Array Advantages
* Random access
* Easy sorting and iteration
* Replacement of multiple variables
### Array Disadvantages
* Size is fixed
* Difficult to insert and delete
* If capacity is more and occupancy less, most of the array gets wasted 
* Needs contiguous memory to get allocated
### Array Applications
* For storing information in a linear fashion
Suitable for applications that require frequent searching
Java Program using Array
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
import java.util.*;
 
class JavaDemo {
    public static void main (String[] args) {
        int[] priceOfPen= new int[5];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<priceOfPen.length;i++)
            priceOfPen[i]=in.nextInt();
 
        for(int i=0;i<priceOfPen.length;i++)
            System.out.print(priceOfPen[i]+" ");
    }
}
 
 
Input:
23 13 56 78 10
 
Output:
23 13 56 78 10
