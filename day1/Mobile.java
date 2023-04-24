package week1.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("make call");
		String mobileModel= "Samsung";
		float mobileWeight=0.25f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}
	public void sendSMS() {
		System.out.println("Send SMS");
		boolean isFullycharged= true;
		int mobilecost=10000;
		System.out.println(isFullycharged);
		System.out.println(mobilecost);
    }	
	 public static void main(String[] args) {
		 System.out.println("This is my Mobile");
		Mobile mob=new Mobile();
		mob.makeCall();
		mob.sendSMS();
	}
}
