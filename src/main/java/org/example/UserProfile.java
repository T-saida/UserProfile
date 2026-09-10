package org.example;

public class UserProfile {
    private final String username;
    private final String email;
    private final String phone;
    private final int age;
    private final boolean isPremium;

    // Теперь принимает интерфейс UserProfileBuilderImpl (или просто используем поля напрямую)
    UserProfile(UserProfileBuilderImpl builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.phone = builder.phone;
        this.age = builder.age;
        this.isPremium = builder.isPremium;
    }

    public void display() {
        System.out.println("User Profile:");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Age: " + age);
        System.out.println("Premium status: " + isPremium);
    }
}
