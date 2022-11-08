package collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class UseTcs {

	public static void main(String[] args) {
		Tcs t1=new Tcs("pondicherry",2000,84789,false);
		Tcs t2=new Tcs("chennai",10000,84747,true);
		Tcs t3=new Tcs("mumbai",19000,95858,true);
		Tcs t4=new Tcs("hyderabad",20000,75648,true);
		Tcs t5=new Tcs("bangalore",25000,26372,false);
		HashMap<Integer,Tcs>tcss=new HashMap<>();
		ArrayList<Tcs>evenTcs=new ArrayList<>();
		HashMap<Integer,Tcs>tcsss=new HashMap<>();
		tcss.put(t1.getBranchId(), t1);
		tcss.put(t2.getBranchId(), t2);
		tcss.put(t3.getBranchId(), t3);
		tcss.put(t4.getBranchId(), t4);
		tcss.put(t5.getBranchId(), t5);
		/*for(Integer x:tcss.keySet()) {
			System.out.println(tcss.get(x));
		}
		tcss.values().forEach(x->System.out.println(x));*/
		int max=0;
		for(Tcs x:tcss.values()) {
			if(x.getEmpNo()>max) {
				max=x.getEmpNo();
			}
		}
		System.out.println(max);
		//Iterator<Integer>itr=tcss.keySet().iterator();
		/*while(itr.hasNext()) {
			if(itr.next()==t2.getBranchId()) 
			{
				itr.remove();
			}
		}
		tcss.values().forEach(x->System.out.println(x));
		Iterator<Tcs>itt=tcss.values().iterator();
		while(itt.hasNext()) {
			if(itt.next().getEmpNo()>20000) {
				itt.remove();
			}
		}
		tcss.values().forEach(x->System.out.println(x));
		tcss.values().forEach(x->{
			if(x.getBranch().length()%2==0) {
				evenTcs.add(x);
			}
		}
		);
		System.out.println(evenTcs);
		tcss.forEach((x,y)->{
			if(y.getBranch().length()%2!=0) {
				tcsss.put(x,y);
			}
		}
		);
		System.out.println(tcsss);*/
		for(Integer x:tcss.keySet()) {
			if(tcss.get(x).getBranch().length()%2==0) {
				tcsss.put(x, tcss.get(x));
			}
		}
		System.out.println(tcsss);

	}

}
