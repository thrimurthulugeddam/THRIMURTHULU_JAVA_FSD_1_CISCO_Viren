package exception;

public class Mycaluclator {
	public long power(int n,int p)
		throws Exception{
			if (n<0 || p<0){
				throw new Exception("n and p must not be negative");
			}
		return Math.round(Math.pow(n, p));
	}

}
