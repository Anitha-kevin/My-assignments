package week3.day1;

public class Students {
public void getStudentInfo(int id) {
System.out.println(id);	
}
public void getStudentInfo(int id,String name) {
	System.out.println(id + name);
}
public void getStudentInfo(String email,long phoneNumber) {
System.out.println(email + phoneNumber);	
}
public static void main(String[] args) {
	Students report=new Students();
	report.getStudentInfo(1354);
	report.getStudentInfo(1354 , "anitha");
	report.getStudentInfo("anitha.priya@gmail.com" , 9877676521l);
}
}
