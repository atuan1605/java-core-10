package service;

import model.User;

import java.util.ArrayList;

public class UserService {

    public void showUser(ArrayList<User> list){
        for (User u: list){
            System.out.println(u);
        }
    }


}
