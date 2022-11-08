package collection2;

import java.util.HashMap;

public class UseCustomerDetails {

	public static void main(String[] args) {
		CustomerDetails c1=new CustomerDetails("raj",18,"raj@gmail.com",837748497464l,15000,true);
		CustomerDetails c2=new CustomerDetails("nisha",38,"nisha@gmail.com",837748497466l,1000,false);
		CustomerDetails c3=new CustomerDetails("keerthana",21,"keerthana@gmail.com",837748497475l,18000,false);
		CustomerDetails c4=new CustomerDetails("suresh",18,"suresh@gmail.com",837748497465l,15000,true);
		CustomerDetails c5=new CustomerDetails("suba",18,"suba@gmail.com",837748497461l,45000,false);
		HashMap<Long,CustomerDetails>details=new HashMap<>();
		details.put(c1.getAdhaarNumber(),c1);
		details.put(c2.getAdhaarNumber(), c2);
		details.put(c3.getAdhaarNumber(), c3);
		details.put(c4.getAdhaarNumber(), c4);
		details.put(c5.getAdhaarNumber(), c5);
		/*for(Long x:details.keySet()) {
			System.out.println(x);
		}
		details.keySet().forEach(x->{System.out.println(details.get(x));});
		for(CustomerDetails x:details.values()) {
			System.out.println(x);
		}
		for(CustomerDetails x:details.values()) {
			if(x.getName().startsWith("s")) {
				System.out.println(x.getName());
			}
			
		}
		details.values().forEach(x->{if(x.getName().equals("nisha")) {
			System.out.println(x);
		}
		});
		details.values().forEach(x-> { if(x.isMale()==false) {
			System.out.println(x);
		}
			
		});*/
		for(CustomerDetails x:details.values()) {
			if(x.getAmountAvailable()>30000) {
				System.out.println(x);
			}
		}
		CustomerDetails q=c1;
		int max=0;
		for(CustomerDetails x:details.values()) {
			if(x.getAge()>max) {
				max=x.getAge();
				q=x;
			}
		}
		System.out.println(q.getName()+" age is "+max);
		





	}

}
