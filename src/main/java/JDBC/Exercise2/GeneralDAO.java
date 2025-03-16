package JDBC.Exercise2;

import java.util.List;

public interface GeneralDAO<T> {
    void createTable();
    void deleteTable();
    void create(final T object);
    void delete(int id);
    void update(T object);
    T findById(int id);
    List<T> findAll();
}