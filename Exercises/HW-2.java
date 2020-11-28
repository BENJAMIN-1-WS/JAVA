
public class HW_1 {
	

	private int num1;
	private int num2;
	private int [] num3=new int[10];
	private String print;
	public HW_1() {
		num1 = 0;
		num2 = 0;
		for(int i=0; i<num3.length;i++) {
			num3[i]+=0;
		}
	}
	public HW_1(int num) {
		num1 = num;
		num2 = num;
		for(int i=0; i<num3.length;i++) {
			num3[i]+=num;
		}
	}
	public HW_1 (HW_1 newHW_1) {
		num1=newHW_1.getNum1();
		num2=newHW_1.getNum2();
		num3=newHW_1.getNum3();
	}
	public int getNum1() {
	return num1;
	}
	
	public int getNum2() {
	return num2;
	}
	public int[] getNum3() {
		return num3;
	}
	public void setNum1(int num1) {
	this.num1 = num1;
	}	
	public void setNum2(int num2) {
	this.num2 = num2;
	}
	public void setNum3(int[] num3) {
	this.num3 = num3;
	}
	

	
	public String toString() {
		
		for(int i=0; i<num3.length;i++) {
			print+=num3[i];
		}
		return
				print+"\n"+
				num1+" :num1 | num2 : "+num1;
	}


	public static void main(String[] args) {
		HW_1 s1 = new HW_1();
		HW_1 s2 = new HW_1(4);
		HW_1 s3 = new HW_1(s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
