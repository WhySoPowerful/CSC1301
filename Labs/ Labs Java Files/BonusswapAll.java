package labs;

public class BonusswapAll

{

public static void swapAll(int a1[],int a2[])

{

int size= a1.length,temp;

for(int i=0;i<size;i++)

{

temp=a1[i];

a1[i]=a2[i];

a2[i]=temp;

}

}

public static void main(String[] a){

int[] a1={11,42,-5,27,0,89};

int[] a2={10,20,30,40,50,60};

int size=a1.length;

System.out.print("Before Function Call :\na1: ");

for(int i=0;i<size;i++)

System.out.print(a1[i]+" ");

System.out.println("");

System.out.print("a2: ");

for(int i=0;i<size;i++)

System.out.print(a2[i]+" ");

System.out.print("\nAfter Function Call :\na1: ");

swapAll(a1,a2);

for(int i=0;i<size;i++)

System.out.print(a1[i]+" ");

System.out.println("");

System.out.print("a2: ");

for(int i=0;i<size;i++)

System.out.print(a2[i]+" ");

}

}