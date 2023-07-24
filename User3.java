public class User3 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("User3 received message: " + message);
    }
}
