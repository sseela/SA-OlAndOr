package olAndOr;

public class ol {
 public void a(int x) {
	 System.out.println("method int");
 }
 public void a(double z) {
	 System.out.println("method double");
 }
 public void a(float z) {
	 System.out.println("method float");
 }
 
 public void a(int x, int y) {
	 System.out.println("two arguments int, int");
 }
 
 public void a(float x, int y) {
	 System.out.println("two arguments float, int");
 }
 
 
 public static void main(String[] a) {
	 ol test = new ol();
	byte b = 12;
	short s = 10;
	int i = 10;
	 test.a(b); // automatic promotion to next higher level
	 test.a(s);// automatic promotion
	 test.a(i);
	 test.a(b,s);
 }
}


