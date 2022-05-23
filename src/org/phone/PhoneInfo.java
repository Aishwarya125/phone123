package org.phone;

public class PhoneInfo
{
	public void PhoneName() {
System.out.println("SAMSUNG GALAXY M12");	// TODO Auto-generated constructor stub
}
	private void phoneMieiNum() {
		// TODO Auto-generated method stub
System.out.println("09876543456789");
	}private void camera() {
		// TODO Auto-generated method stub
System.out.println("32MEGA PIXELS");
	}private void storage() {
		// TODO Auto-generated method stub
System.out.println("64GB");
	}private void osName() {
		// TODO Auto-generated method stub
System.out.println("Windows 10");
	}public static void main(String[] args) {
		PhoneInfo p=new PhoneInfo();
		p.PhoneName();
		p.phoneMieiNum();
		p.camera();
		p.storage();
		p.osName();
	}

}
