package Testpractice;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());

        }
}

