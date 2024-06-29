package threads.ex6;

public class Consumer extends Thread {

    private final String name;

    private final CommonResource resource;

    public Consumer(String name, CommonResource resource) {
        this.name = name;
        this.resource = resource;
    }

    @Override
    public void run() {
        //consumer
        try {
            resource.consume();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
