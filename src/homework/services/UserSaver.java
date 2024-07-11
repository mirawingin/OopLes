package homework.services;

import homework.interfaces.*;
import homework.exceptions.PersistenceException;

/*
// код c homework
// Проблемы: Прямая зависимость от конкретного класса User, отсутствие интерфейса
public class Persister {
    private final User user;

    public Persister(User user) {
        this.user = user;
    }

    public void save() {
        System.out.println("Save user: " + user.getName());
    }
}
*/

// Новый код
// Улучшения: Использование интерфейса, обработка ошибок
public class UserSaver implements ISaver {
    @Override
    public void save(IUser user) throws PersistenceException {
        System.out.println("Сохраняем пользователя: " + user.getName());
        if (user.getName().isEmpty()) {
            throw new PersistenceException("Нельзя сохранить пользователя с пустым именем");
        }
    }
}
