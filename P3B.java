class P3B extends P3A {
private int z;
public void getJumlah(){
System.out.println("jumlah:"+ (x+y+z));
}
public void setZ(int z){
this.z = z; 
} }

class P3A {
private int x;
private int y;
public void setX(int x){
this.x = x;

public void setY(int y){
this.y = y;
}

public void getNilai(){
System.out.println("nilai x: "+ x +" nilai y: " + y);
}

class InheritanceTest{
	public static void main(String [] args){
		A ortu = new A();
		B anak = new B();
			System.out.println("superclass");
		ortu.setX(10);
		ortu.setY(20); 
		ortu.getNilai();
		System.out.println("sub Class");
		anak.setX(5);
		anak.setY(4);
		anak.getNilai();
		anak.setZ(50);
		anak.getJumlah();	
}
}