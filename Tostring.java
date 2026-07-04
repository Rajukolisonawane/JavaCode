package logic;

import java.util.Arrays;

public class Tostring {

	public static void main(String[] args) {
		// WAP using tocharArray(), toString()
int []no=new int[3];
no[0]=3;
no[1]=3;
no[2]=4;
//no[3]=6;
String []name=new String[3];
name[1]="raju";
name[2]="raju1";
System.out.println(Arrays.toString(no));
System.out.println(Arrays.toString(name));

char [] i1=new char[4];
i1[0]='D';
i1[1]='M';
i1[2]='M';
i1[3]='S';
System.out.println(Arrays.toString(i1));


for(int i=0;i>=3;i++) {
	System.out.println(i);
}
	}

}
