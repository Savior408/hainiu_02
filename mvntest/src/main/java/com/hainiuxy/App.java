package com.hainiuxy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static String start(){
        System.out.println("start");
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");

        System.out.println("ddd");
        System.out.println("eee");
        return "start";
    }

    public boolean login(String username, String password){

        User user = new User(username,password);

        if (user != null){
            return true;
        }else {
            return false;
        }

    }
}
