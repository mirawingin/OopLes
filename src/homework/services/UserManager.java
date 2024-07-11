package homework.services;

import homework.interfaces.*;
import homework.exceptions.PersistenceException;

// Новый код
// Улучшения: Централизованное управление операциями с пользователями
public class UserManager {
    private final ISaver saver;
    private final IReporter reporter;

    public UserManager(ISaver saver, IReporter reporter) {
        this.saver = saver;
        this.reporter = reporter;
    }

    public void saveUser(IUser user) throws PersistenceException {
        saver.save(user);
    }

    public void reportUser(IUser user) {
        reporter.report(user);
    }
}
