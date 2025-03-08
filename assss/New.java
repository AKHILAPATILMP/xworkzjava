class New{
public static void main(String[] args)
{
System.out.println(new int[15]);
int arr1[]={1,2,3,4};
for (int index:arr1){
System.out.println("elements"+index);
}
int arr2[];
arr2=arr1.clone();
for (int index:arr2){
System.out.println("elements"+index);
}

}
}
//arr2=arr1.clone(); to copy the content of arr1