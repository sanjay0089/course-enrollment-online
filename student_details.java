package course_enrollment;

import java.util.*;

public class student_details {
	private int id;
	private String name;
	private int age;
	private String password;
	private String gender;
	Scanner sc=new Scanner(System.in);
	 student_details(){
		System.out.println("Enter your studentid");
		this.id=sc.nextInt();
		System.out.println("Enter your naem");
		this.name=sc.nextLine();
		System.out.println("Enter your age");
		this.age=sc.nextInt();
		System.out.println("Enter your password");
		this.password=sc.nextLine();
		System.out.println("Enter your gender");
		this.gender=sc.nextLine();
	}
	public String getname() {
		return name;
	}
	public String getpassword() {
		return password;
	}
	public int getid() {
		return id;
}
}