public class Main {
    public static void main(String[] args) {
        OddThread o = new OddThread();
        EvenThread e= new EvenThread();
        o.setName("oo");
        e.setName("ee");
        o.start();
        try {
            o.join();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        e.start();
    }
}
