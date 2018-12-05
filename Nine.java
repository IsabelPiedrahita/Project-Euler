
/**
 * 
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * @author Isabel Piedrahita
 */
public class Nine
{
    public static void main(){
        for(int c=1 ; c<1000 ; c++){
            for(int b=1 ; b<c ; b++){
                for(int a=1 ; a<b ; a++){
                    if((Math.pow(a,2)+Math.pow(b,2))==Math.pow(c,2)){
                        if(a+b+c == 1000){
                            System.out.println(a*b*c);
                        }
                    }
                }
            }
        }
    }
}
