package org.calssinterfaceexercises.zad_1_PATTERN_CIEKAWE;

public class UserValidator {

    void validateEmails(String email, String alternativeEmail) {

        class Email {

            private String email;
            private String alternativeEmail;

            public Email(String email, String alternativeEmail) {
                this.email = email;
                this.alternativeEmail = alternativeEmail;
            }

            void setEmailAsUnknown() {

                if (email.isEmpty() || email.isBlank() || email == null) {
                    email = "unknown";
                }

                if (alternativeEmail.isEmpty() || alternativeEmail.isBlank()|| alternativeEmail == null) {
                    alternativeEmail = "unknown";
                }
            }

            void validateEmail() {
                if (!(email.matches("\\w*\\.?\\w+@{1}[a-z]+\\.{1}[a-z]{2,3}"))) {
                    email = "unknown";
                }

                if (!(alternativeEmail.matches("\\w*\\.?\\w+@{1}[a-z]+\\.{1}[a-z]{2,3}"))) {
                    alternativeEmail = "unknown";
                }
            }
        }

        Email emailChecker = new Email(email, alternativeEmail);
        emailChecker.validateEmail();
        emailChecker.setEmailAsUnknown();

        System.out.println(emailChecker.email);
        System.out.println(emailChecker.alternativeEmail);

    }
}
