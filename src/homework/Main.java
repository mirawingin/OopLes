package homework;

import homework.interfaces.*;
import homework.model.User;
import homework.services.*;
import homework.exceptions.PersistenceException;

public class Main {
    /*
    // код c homework
    // Проблема: Прямая зависимость от конкретных классов, отсутствие обработки ошибок
    public static void main(String[] args) {
        User user = new User("Bob");
        user.report();
        user.save();
    }
    */

    // Новый код
    // Улучшения: Использование интерфейсов, обработка ошибок, разделение ответственности
    public static void main(String[] args) {
        ISaver saver = new UserSaver();
        IReporter reporter = new UserReporter();

        UserManager userManager = new UserManager(saver, reporter);

        IUser user = (IUser) new User("Bob");

        try {
            userManager.saveUser(user);
            userManager.reportUser(user);
            System.out.println("Все операции выполнены успешно.");
        } catch (PersistenceException e) {
            System.out.println("Ошибка при сохранении: " + e.getMessage());
        }
    }
}
