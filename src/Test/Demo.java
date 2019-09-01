package Test;

/**
 * @Author LingLong.gzw
 * @create 2019-08-18
 */
public class Demo {
    private static String a="a";
    private static String b="b";

    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("thread 1 is running");
            try {

                while(true){
                    synchronized (a){
                        System.out.println("lock1 locked a");
                        Thread.sleep(1000);
                        synchronized (b){
                            System.out.println("lock1 locked b");
                        }
                    }
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            System.out.println("thread 2 is running");
            try {

                while(true){
                    synchronized (b){
                        System.out.println("lock2 locked b");
                        Thread.sleep(1000);
                        synchronized (a){
                            System.out.println("lock2 lock a");
                        }
                    }
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
