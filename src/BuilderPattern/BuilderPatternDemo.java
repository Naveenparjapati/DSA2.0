package BuilderPattern;

public class BuilderPatternDemo {
	public static void main(String[] args) {
        User user1 = new User.UserBuilder("Alice", "alice@email.com")
                .phone("9876543210")
                .build();

        User user2 = new User.UserBuilder("Bob", "bob@email.com")
                .address("Bangalore, India")
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}
