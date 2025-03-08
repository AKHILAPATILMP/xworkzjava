class Argws{
public static void main(String[] args){
int[] arr=new int[5];
for(int i=0;i<=arr.length;i++){
System.out.println("elements"+i +":"+ arr[i]);

}
}
}
//The default value of an uninitialized integer array in Java is 0.
//(initially we get compilation error)

//Explanation:
//When you declare an integer array in Java using new, each element is automatically initialized to the default value for integers, which is 0.

//If the array is declared as an instance variable, it will be initialized with 0 by default.
//If the array is declared within a method, it must be explicitly initialized before being used.