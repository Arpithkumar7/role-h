
package ram;
import java.util.Scanner;
public class As {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Role r=new Role();
         Scanner s= new Scanner(System.in);
		
		String ro=s.nextLine();
		System.out.println(r.AddSubRole(r));
		
	}
	
	public static class Role{
		String role;
		String reportsTo;

		public String getReportsTo() {
			return reportsTo;
		}

		public void setReportsTo(String reportsTo) {
			this.reportsTo = reportsTo;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}
		
		Scanner s= new Scanner(System.in);
		
		public String AddSubRole(Role r) {
			String subrole="";
			String reportsT="";
			System.out.println("enter the subrole name");
			subrole=s.nextLine();
			System.out.println("enter the reporting to sub role");
			reportsT=s.nextLine();
			System.out.println("subrole added " + subrole);
			System.out.println("reporting to " + reportsT);
			return subrole;
		}
		
	}

}
