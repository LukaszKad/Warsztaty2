package pl.coderslab;


import pl.coderslab.dao.UserDao;
import pl.coderslab.domain.User;

public class Main {

    public static void main(String[] args) {
        // write your code here

        User user= new User("name","email@email.com","passw");
        UserDao dao = new UserDao();
        dao.create(user);
    }
}