package course_enrollment;
import java.util.*;
public class course {
	private String name;
	private int capacity;
	private int courseid;
	Scanner sc=new Scanner(System.in);
	course(){
		System.out.println("Enter your name");
		this.name=sc.nextLine();
		System.out.println("Enter your capacity");
		this.capacity=sc.nextInt();
		System.out.println("Enter your courseid");
		this.courseid=sc.nextInt();
	}
	public int getid() {
		return courseid;
	}
	public int getcapacity() {
		return capacity;
	}
	public boolean check(int courseid,int studentid,ArrayList<course>cou,ArrayList<enrollmentdetails>e) {
		int val=0;
		for(course c:cou) {
			if(courseid==c.getid()) {
				val++;
			}
		}
		int temp=0;
		for(enrollmentdetails ed: e) {
			if(ed.getcourseid()==courseid) {
				temp++;
			}
		}
		enrollmentdetails en=new enrollmentdetails();
		if(val>temp) {
			en.setstudentid(studentid);
			en.setcourseid(courseid);
			e.add(en);
			return true;
		}
		else return false;
	}
	public boolean cancel(int courseid,int studentid,ArrayList<course>cou,ArrayList<enrollmentdetails>e) {
		for(enrollmentdetails ed:e) {
			if(ed.getcourseid()==courseid&&ed.getstudentid()==studentid) {
				e.remove(ed);
				return true;
			}
		}
		return false;
	}
}
