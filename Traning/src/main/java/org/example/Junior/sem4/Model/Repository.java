package org.example.Junior.sem4.Model;

import java.util.List;

public interface Repository<T, TId> {

    void create(T item);

    void delete(TId id);

    T getByID(TId id);

    void deleteAll();

    List<T> getAllList();
}
