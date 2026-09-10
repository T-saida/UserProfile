package org.example;

public interface UserProfileBuilder {
    UserProfileBuilder setUsername(String username);
    UserProfileBuilder setEmail(String email);
    UserProfileBuilder setPhone(String phone);
    UserProfileBuilder setAge(int age);
    UserProfileBuilder setPremium(boolean isPremium);
    UserProfile build();
}