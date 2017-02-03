/**
 * Created by Greg on 03.02.2017.
 */
public class Main {
    public static void main(String args[]){

        Thread[] threads= new Thread[100];
        for (int i = 0; i <100; i++){
            threads[i] = new Thread(new Factorial());
            threads[i].start();
        }

    }
}
