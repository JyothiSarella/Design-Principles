import java.util.*;
public class SingleResponsibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of students");
int n=sc.nextInt();
String s[]=new String[n];
System.out.println("Enter the student names");
for(int i=0;i<n;i++)
{s[i]=sc.next();
String a=s[i];
if(!sec.checkdept(a))
{
	System.out.println("Enter a valid department");
	s[i]=sc.next();
}

	}
System.out.println("Entered departments");
for(int i=0;i<n;i++)
{System.out.print(s[i]+" ");
	}

	}

}
