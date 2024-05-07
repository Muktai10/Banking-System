package assignment5b;

public class Administrator {
	
    public void manageUsers(User[] users) {
        System.out.println("Administrator is managing users...");
        
        for (User user : users) {
            System.out.println("User ID: " + user.getuserId() + ", Name: " + user.getname() + ", Email: " + user.getemail());
        }
    }
}

