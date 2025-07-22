 package BuilderPattern;

public class User {
	 // Required fields
    private final String username;
    private final String email;

    // Optional fields
    private final String phone;
    private final String address;

    private User(UserBuilder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getUsername()
    {
    	return username;
    }
    public String getEmail() 
    {
    	return email;
    }
    public String getPhone() 
    {
    	return phone; 
    }
    public String getAddress() 
    {
    	return address; 
    }

    // The static Builder class
    public static class UserBuilder {
        private final String username;
        private final String email;

        private String phone;
        private String address;

        public UserBuilder(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", email=" + email +
               ", phone=" + phone + ", address=" + address + "]";
    }
}
