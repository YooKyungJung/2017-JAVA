package wrapper;

public class ExIII_1 { 
	public static void main(String[] args) {
	String data1="10";
	String data2="20";
	//parseInt
	int i1=Integer.parseInt(data1);
	int i2=Integer.parseInt(data2);
	System.out.println(i1+i2);
	//parseDouble
	Double d1=Double.parseDouble(data1);
	Double d2=Double.parseDouble(data2);
	System.out.println(d1+d2);
	//intValue
	int i3=Integer.valueOf(data1).intValue();
	int i4=Integer.valueOf(data2).intValue();
	System.out.println(i3+i4);
	//doubleValue
	Double d3=Double.valueOf(data1).doubleValue();
	Double d4=Double.valueOf(data2).doubleValue();
	System.out.println(d3+d4);
	}

}
