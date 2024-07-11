package homework.interfaces;

import homework.exceptions.PersistenceException;

public interface ISaver {
    void save(IUser user) throws PersistenceException;
}
