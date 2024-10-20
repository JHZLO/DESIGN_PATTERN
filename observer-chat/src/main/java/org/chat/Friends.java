package org.chat;

public class Friends {
    private String name;
    private Integer age;
    private String phoneNumber;

    FirendsDisplay firendsDisplay = new FirendsDisplay();

    public void setFriends(String name, Integer age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        notifyFriendsDisplay();
    }

    private void notifyFriendsDisplay(){
        firendsDisplay.update(getName(), getAge(), getPhoneNumber());
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}
