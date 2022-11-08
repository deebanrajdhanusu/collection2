package collection2;

public class Tcs {
	private String branch;
	private int empNo;
	private int branchId;
	private boolean cabAvailable;
	public Tcs(String a,int b,int c,boolean d) {
		branch=a;
		empNo=b;
		branchId=c;
		cabAvailable=d;
	}
	public String toString() {
		return (branch+" "+empNo+" "+branchId+" "+cabAvailable);
	}
	public int getBranchId() {
		return branchId;
	}
	public boolean getCabAvailable() {
		return cabAvailable;
	}
	public String getBranch() {
		return branch;
	}
	public int getEmpNo() {
		return empNo;
	}
	

}
