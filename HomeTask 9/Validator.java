package com.hometask.hometask9;

public class Validator {
    public static final int MIN_AGE = 12;
    public static final int NAME_LENGTH = 10;
    public static final String GENDER = "Female";
    private boolean smt;


    public boolean getSmt() {
        return smt;
    }


    public void validatorCheck(Users user) throws Exception {

        try {
            if (user.getAge() < MIN_AGE) {
                throw new Exception("Your age is too low!");
            }
            if (user.getName().length() > NAME_LENGTH) {
                throw new Exception("Check your name!");
            }
            if (user.getGender() == GENDER) {
                throw new Exception("This film is only for Male persons!");
            }
            smt = false;
        } catch (Exception e) {
            smt = true;
            System.out.println("Exception!  " + e.getMessage());
        }
    }
}

