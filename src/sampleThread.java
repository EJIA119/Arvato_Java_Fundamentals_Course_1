import static java.lang.Thread.sleep;

public class sampleThread {

    public static void main(String[] args) throws Exception {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                }catch(Exception ex) {

                }

            }
        };

        thread.start();

        Thread.sleep(1000);
        System.out.println("do next process can not wait");
        thread.join();
        System.out.println("do next process can wait");

    }

}
