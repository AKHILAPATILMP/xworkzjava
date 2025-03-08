class allow{
public static void main(String[] args){
int arr1[]={1,2,3,4};
for (int index:arr1){
System.out.println("elements"+index);

}
}
}
////	question 3
//array can take duplicate values
//array can store both primitive and non-primitive data types
//array size can be changed after declaration
//Size of array cannot be changed after declaration
//array can store both primitive and object reference

//----How can you initialize a two-dimensional array in Java?
//int arr[2][2] = {{1,2},{3,4}};
//int arr[][] = {{1,2},{3,4}};
//int arr[2,2] = {1,2,3,4};
//int arr[][] = new int[2][2]{{1,2},{3,4}};

//---What happens when you pass an array to a method in Java?
//A copy of the array is passed
//The original array reference is passed(answer)
//Only the first element is passed
//It causes an error

//-----What is the output of System.out.println(new int[3]);?
//000
//[I@hashcode(ans)
//null
//Compilation error

//------Which statement is true about multi-dimensional arrays in Java?
//Java does not support multidimensional arrays(supports)
//Java supports dynamic multidimensional arrays(crct)
//You cannot create jagged arrays in Java(we can that means subarryas like 2d)
//Java arrays are always one-dimensional(it can be 2d also)

