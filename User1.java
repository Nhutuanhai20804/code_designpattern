public class User1 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("User1 received message: " + message);
    }
}
