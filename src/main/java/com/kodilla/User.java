package com.kodilla;

class User {
    String name;
    double age;
    double height;
    public User(String name, double age, double height) {
        this.age=age;
        this.height=height;
        this.name=name;
    }
    public double getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }
    public String getName() {
        return name;
    }
}
class UserCheck {
    public boolean checkName(User user) {
        if(user.getName()!=null) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkAge(User user) {
        if(user.getAge() <= 30) {
            return false;
        } else {
            return true;
        }
    }
    public boolean checkHeight(User user) {
        if(user.getHeight() <= 160) {
            return false;
        } else {
            return true;
        }
    }
}
class Application {
    public static void main (String[] args) throws java.lang.Exception {
        User user = new User("Adam", 40.5, 178);
        UserCheck check = new UserCheck();
        boolean enteredName = check.checkName(user);
        boolean isOldEnough = check.checkAge(user);
        boolean isTallEnough = check.checkHeight(user);
        if(enteredName) {
            if(isOldEnough&&isTallEnough) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }
}
