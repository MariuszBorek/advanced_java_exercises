package org.calssinterfaceexercises.zad_4_CIEKAWE_WAZNE;

public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Piotr", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() && input != null && (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z' );
            }
        });
        System.out.println(user.getName());

        user.setSurname("Krzywousty", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty() && input != null && (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z' );
            }
        });
        System.out.println(user.getSurname());

        user.setAge(28, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return  input >= 0 && input <= 150;
            }
        });
        System.out.println(user.getAge());

        user.setLogin("Grzegori12", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });
        System.out.println(user.getLogin());

        user.setPassword("!rackaracka!", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.matches(".*!.*");
            }
        });
        System.out.println(user.getPassword());
    }
}
