package com.chirag.rawal.edureka10;

public class Client {

    public String SetUsername(userDetails userD){
        String username;
        try{
            username = userD.getUsername();
        }
        catch (NullPointerException e){
            username = "No Username";
        }
        return userD.getUsername();
    }

    public String SetPassword(userDetails userD){
        String password;
        try{
            password = userD.getPassword()  ;
        }
        catch (NullPointerException e){
            password = "No Password";
        }
        return userD.getPassword();
    }
}
