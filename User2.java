public class User2 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("User2 received message: " + message);
    }
}

