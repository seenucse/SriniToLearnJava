package mylearn;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a ={1,2,3,4,5,6};
int total =0;
int size = a.length;

for (int i=size-1; i>=0; i--) {   
	
	System.out.println("value of array :" +a[i]); 
	
if (total<a[i])
{
	total = a[i];
}
	}
	System.out.println("Largest Number :" +total); 
} 
}
