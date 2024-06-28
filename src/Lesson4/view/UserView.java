package Lesson4.view;

import Lesson4.model.User;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> users);
}
