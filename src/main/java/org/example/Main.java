package org.example;

public class Main {
    public static void main(String[] args) {
        // Тестируем стандартный билдер
        UserProfile standardUser = new UserProfileBuilderImpl()
                .setUsername("JohnDoe")
                .setEmail("john@example.com")
                .setAge(20)
                .setPremium(true)
                .build();

        standardUser.display();

        System.out.println("-------------------");


        UserProfile adminUser = new AdminProfileBuilder()
                .setUsername("SuperUser")
                .setEmail("admin@company.com")
                .build();

        adminUser.display();
    }
}
