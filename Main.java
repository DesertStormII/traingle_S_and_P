
public class Main
{
	public static void main(String[] args) {
	    //traingle 
	    int a = 6;
	    int b = 7;
	    int c = 8;
	    int P = a + b + c;
	    int p = P / 2;
	    double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println(" Perimetr " + P);
		System.out.println(" Area " + S);
	}
}
