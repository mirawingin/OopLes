package homework.services;

import homework.interfaces.*;

// Новый код
// Улучшения: Отдельный класс для создания отчетов, использование интерфейса
public class UserReporter implements IReporter {
    @Override
    public void report(IUser user) {
        System.out.println("Отчет о пользователе: " + user.getName());
    }
}
