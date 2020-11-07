
public class HW_1 {
	

	private int idd;
	private String name;
	
	public HW_1() {
		idd = 0;
		name = "Temp";
	}
	public HW_1(int id, String _name) {
		this.idd = id;
		name = _name;	
	}
//ghsusiddksdmksdk
	public HW_1 (int _id) {
		this.idd = _id;
		name = "temp";
	}
	
	public void ChangeName(String s) {
		name = s;
			
	}
	
	public String toString() {
		return idd+" :id | name : "+name;
	}


	public static void main(String[] args) {
		HW_1 s = new HW_1(123213,"ben");
		HW_1 s2 = new HW_1(123213,"ben");
		System.out.print(s+"\n");
		s.ChangeName("alex");
		System.out.print(s);
	}

}
