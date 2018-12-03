
/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 *
 * @authorIsabel Piedrahita
 */
public class Seven
{
    public static void main(){
        int currentPrime = -1;
        for(int i=1 ; i<=2147483647 ; i++){
             boolean prime = isPrime(i);
                if(prime){
                    currentPrime++;
                    if(currentPrime == 10001){
                        System.out.println(i);
                        break;
                    }
                } 
            }
    }
    
    public static boolean isPrime(int nu){
        for(int i=2 ; i<=nu/2 ; i++){
            if(nu%i == 0){
                return false;
            }
        }
        return true;
    }
}
