package org.example;

public class AdminProfileBuilder implements UserProfileBuilder {
    String username;
    String email;
    String phone = "Admin Hotline";
    int age = 25;
    boolean isPremium = true;

    @Override
    public UserProfileBuilder setUsername(String username) {
        this.username = "ADMIN_" + username;
        return this;
    }

    @Override
    public UserProfileBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public UserProfileBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public UserProfileBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public UserProfileBuilder setPremium(boolean isPremium) {
        this.isPremium = true;
        return this;
    }

    @Override
    public UserProfile build() {
        if (username == null) {
            throw new IllegalStateException("Admin username required");
        }
        UserProfileBuilderImpl builder = new UserProfileBuilderImpl();
        builder.setUsername(this.username);
        builder.setEmail(this.email);
        builder.setPhone(this.phone);
        builder.setAge(this.age);
        builder.setPremium(this.isPremium);
        return new UserProfile(builder);
    }
}