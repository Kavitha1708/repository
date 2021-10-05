import java.math.BigInteger;
public class FactorialofBigNumber{

	public static void main(String[] args){
	
		BigInteger fact=BigInteger.valueof(1);
		for(int i=1;i<=100;i++){
		
			fact=fact.mutiply( BigInteger.valueof(i));
		}
		System.out.println("Factorial is:"+fact);
	}

}
