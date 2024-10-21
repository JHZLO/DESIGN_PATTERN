package org.chat.domain;

import java.util.Objects;

public class Friend {
    private final String name;
    private final Integer age;
    private final String phoneNumber;


    public Friend(String name, Integer age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Friend friend = (Friend) o;
        return Objects.equals(name, friend.name) &&
                Objects.equals(age, friend.age) &&
                Objects.equals(phoneNumber, friend.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, phoneNumber);
    }
}
