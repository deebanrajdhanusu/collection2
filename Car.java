package collection2;

public class Car {
	private String registerNo;
	private int price;
	private boolean isSportsCar;
	private String brand;
	public Car(String a,String b,int c,boolean d) {
		brand=a;
		registerNo=b;
		price=c;
		isSportsCar=d;
	}
	public String toString() {
		return (brand+" "+price+" "+registerNo+" "+isSportsCar);
	}
	public String getBrand() {
		return brand;
	}
	public String getRegisterNo() {
		return registerNo;
	}
	public int getPrice() {
		return price;
	}
	public boolean getIsSportsCar() {
		return isSportsCar;
	}

}
