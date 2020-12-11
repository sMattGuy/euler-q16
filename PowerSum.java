import java.math.*;
public class PowerSum{
	public static void main(String[] args){
		BigInteger answer = new BigInteger("1");
		for(int i=1;i<=Integer.parseInt(args[0]);i++){
			answer = answer.multiply(new BigInteger("2"));
		}
		String result = answer.toString();
		int output = 0;
		for(int i=0;i<result.length();i++){
			output = output+Integer.parseInt(Character.toString(result.charAt(i)));
		}
		System.out.println(output);
	}
}