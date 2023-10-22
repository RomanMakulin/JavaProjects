package org.example;

public class TicTac implements Runnable{

    private final String number;
    private final Object monitor;

    public TicTac(String number) {
        this.number = number;
        this.monitor = TicTac.class;
    }

    @Override
    public void run() {
        while (true){
            synchronized (monitor){
                System.out.print(number);
                try {
                    Thread.sleep(300);
                    monitor.notify();
                    monitor.wait();
                } catch (Exception e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
