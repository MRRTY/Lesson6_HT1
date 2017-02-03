import java.math.BigInteger;

/**
 * Created by Greg on 03.02.2017.
 */
public class Factorial implements Runnable {
    private int n;

    public Factorial() {
    }

    public Factorial(int n) {

        this.n = n;

    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        n = Integer.parseInt(thr.getName().substring(7));

        System.out.println("!"+n+" = "+fact());

    }
    private BigInteger fact(){
        BigInteger res = new BigInteger("1");
        for(int i = 1; i<=n; i++){
            res = res.multiply(new BigInteger(""+i));
        }
        return res;
    }
}
