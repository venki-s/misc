package prime;

public class IntTest {

	public static void main(String args[] ) throws Exception {
        
        int n = 15;
        boolean isPrime = true;
        for(int i=2;i<=n;i++)   {
            for(int j=2;j<=i/2;j++) {
                if(i!=j && i%j==0)  {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
            isPrime = true;
        }

    }

}
