package week3.day1;

public class Automation extends MultipleLanguage {

public void Selenium() {
System.out.println("Selenium language");	
}

public void java() {
	System.out.println("Java language");	
}

@Override
public void ruby() {
	System.out.println("Ruby language");	
}
public static void main(String[] args) {
	Automation laug=new Automation();
	laug.java();
	laug.python();
	laug.ruby();
	laug.Selenium();
	
}
}
