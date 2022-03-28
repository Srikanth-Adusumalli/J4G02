package function;
public class Function {
	public int add(int[] i) {
		int add=0;
		for(int j=0;j<i.length;j++){
			add=add+i[j];
		}
		return add;
	}
	public int average(int[] i) {
		int avg=add(i)/i.length;
		return avg;
	}
public static void main(String args) {
	int[]i1= {1,2,3,4,5};
	Function f=new Function();
	System.out.println(f.add(i1));
	System.out.println(f.average(i1));
}
}