package org.example;

public class Human {

    private Transport currentTransport;

    public void stop() {
        if (currentTransport != null) {
            currentTransport.stop();
            currentTransport = null;
        } else {
            System.out.println("Не тронулись");
        }
    }

    public void drive(Transport transport) {
        if (currentTransport == null) {
            transport.start();
            currentTransport = transport;
        } else {
            System.out.println("Уже едем");
        }
    }
}
