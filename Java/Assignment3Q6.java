import java.util.*;

class Chatroom {
    private String name;
    private Set<String> username;
    private List<String> messages;

    {
        name = "";
        username = new HashSet<String>();
        messages = new ArrayList<String>();
    }
    public boolean removeUser(String username) {
        return this.username.remove(username);
    }

    public void addUsername(String name){
        this.username.add(name);

    }

}

class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

class ChatApplication {
    private Map<String, Chatroom> chatrooms = new HashMap<String, Chatroom>();
    private Map<String, User> users = new HashMap<String, User>();
    private Set<String> loggedInUsers = new HashSet<String>();

    public boolean isChatroomNameValid(String name) {
        return true;
    }

    public boolean isUsernameExists(String username) {
        List<User> user = new ArrayList<>(users.values());
        for(User u:user){
            if(username.equals(u.getUsername())){
                return true;
            }
        }
        return false;
    }

    public boolean authenticateUser(String username, String password) {
        List<User> user = new ArrayList<>(users.values());
        for(User u:user){
            if(username.equals(u.getUsername()) && password.equals(u.getPassword())){
                return true;
            }
        }
        return false;
    }

    //UI Methods Below
    public void createChatroom() {

    }

    public void addNewUser() {}

    public boolean login() {
        return true;
    }

    public void sendMessage() {}
    public void printMessages() {}

    public void listUsersFromChatroom() {}

    public void logout(){}

    public void deleteUser(){}


    public void menu() {}
}

public class Assignment3Q6 {
    public static void main(String[] args){}

}