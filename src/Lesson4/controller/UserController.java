package Lesson4.controller;

import Lesson4.model.User;

public interface UserController<T extends User> {
    T create(String lastName, String firstName, String middleName);
}
