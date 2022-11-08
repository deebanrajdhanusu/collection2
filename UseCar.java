package collection2;

import java.util.ArrayList;
import java.util.HashMap;

public class UseCar {

	public static void main(String[] args) {
		Car car1=new Car("volvo","py05",400000,false);
		Car car2=new Car("tesla","tn05",1200000,true);
		Car car3=new Car("lamborghini","py02",800000,true);
		Car car4=new Car("honda","py01",200000,false);
		Car car5=new Car("porche","py04",900000,true);
		ArrayList<Car>cars=new ArrayList<>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		HashMap<String,Car>carss=new HashMap<>();
		for(Car x:cars) 
		{
			carss.put(x.getRegisterNo(), x);
		}
		//System.out.println(carss);
		for(String x:carss.keySet()) {
			System.out.println(carss.get(x));
		}
		
		
		

	}

}
