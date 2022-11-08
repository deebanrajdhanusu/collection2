package collection2;

public class CustomerDetails {
	private String name;
	private int age;
	private String email;
	private long adhaarNumber;
	private int amountAvailable;
	private boolean isMale;
	public CustomerDetails(String a,int b,String c,long d,int e,boolean f) {
		name=a;
		age=b;
		email=c;
		adhaarNumber=d;
		amountAvailable=e;
		isMale=f;
	}
	public String toString() {
		return (name+" "+age+" "+email+" "+adhaarNumber+" "+amountAvailable+" "+isMale);
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public int getAmountAvailable() {
		return amountAvailable;
	}
	public long getAdhaarNumber() {
		return adhaarNumber;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setAdhaarNumber(long adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAmountAvailable(int amountAvailable) {
		this.amountAvailable = amountAvailable;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

}
