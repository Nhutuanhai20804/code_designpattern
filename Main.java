public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        User1 user1 = new User1();
        User2 user2 = new User2();
        User3 user3 = new User3();
        subject.registerObserver(user1);
        subject.registerObserver(user2);
        subject.registerObserver(user3);
        subject.setMessage("Hello, this is a notification.");
        subject.unregisterObserver(user2);
        subject.setMessage("Hello, we are observers.");
    }
}

