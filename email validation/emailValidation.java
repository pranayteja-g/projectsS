import java.util.Scanner;

public class emailValidation{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		//initializing the array
		String[] a = {"ro12@gmail.com","bash@gmail.com","noneo@gmail.com",
				"bob@hotmail.com","robert@gmail.com","pops@yahoo.com"};
		boolean valid = false;
		System.out.println("enter the email id");
		//getting the email id from the user
		String email = inp.next();
		inp.close();
			for(int i=0;i<a.length;i++) {
				/*System.out.println(a[i]+" ");
				checking through the array of emails for validation*/
				if(a[i].equals(email)) {
					System.out.println("\n hello!"+" "+email);
					valid = true;
					break;
				}
			}
			if(valid==false) {
				System.out.println("\n email not recognized, please enter a valid email: ");
			}
		}
		
}