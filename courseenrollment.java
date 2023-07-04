package course_enrollment;
import java.util.*;
public class courseenrollment {
	public static void main (String[]args) {
		ArrayList<student_details> st=new ArrayList<student_details>();
		ArrayList<course> cou=new ArrayList<course>();
		ArrayList<enrollmentdetails> e=new ArrayList<enrollmentdetails>();
		int userinp=1;
		Scanner inp=new Scanner(System.in);
		while(userinp!=1||userinp!=2) {
			System.out.println("Enter 1 for course enrollment 2 for cancellatioin");
			userinp=inp.nextInt();
			if(userinp==1||userinp==2){
				System.out.println("Do you have an account Print yes or no");
				String s=inp.nextLine();
				if(s=="yes") {
					boolean ans=false;
					while(!ans)
					System.out.println("enter your username");
					String username=inp.nextLine();
					System.out.println("enter your password");
					String password=inp.nextLine();
					student_details student=new student_details();
					student=null;
					for(student_details sd:st) {
						if(sd.getname().equals(username)&&sd.getpassword().equals(password)) {
							student=sd;break;
						}
					}
					if(student==null) {
						System.out.println("your username or password is incorrect");
					}
					else {
						if(userinp==1) {
							System.out.println("Enter the course id to register");
							int id=inp.nextInt();
							course co=new course();
							boolean a=co.check(id,student.getid(),cou,e);
							if(a) {
								System.out.println("your registration is successfull");
							}
							else System.out.println("course is already filled");
						}
						else {
							System.out.println("Enter the course id to cancel");
							int id=inp.nextInt();
							course co=new course();
							boolean a=co.cancel(id,student.getid(),cou,e);
							if(a) {
								System.out.println("your course is successfully cancelled");
							}
							else System.out.println("there is no course related to this id");
						}
					}
				}
				else if(s=="no") {
					student_details streg=new student_details();
					st.add(streg);
					student_details student=new student_details();
					if(userinp==1) {
						System.out.println("Enter the course id to register");
						int id=inp.nextInt();
						course co=new course();
						boolean a=co.check(id,student.getid(),cou,e);
						if(a) {
							System.out.println("your registration is successfull");
						}
						else System.out.println("course is already filled");
					}
					else {
						System.out.println("Enter the course id to cancel");
						int id=inp.nextInt();
						course co=new course();
						boolean a=co.cancel(id,student.getid(),cou,e);
						if(a) {
							System.out.println("your course is successfully cancelled");
						}
						else System.out.println("there is no course related to this id");
					}
				}
			}
		}
	}
};