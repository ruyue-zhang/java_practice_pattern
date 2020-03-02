package com.thoughtworks;

import java.util.List;

public interface Repository<E> {
    void save(String id, E entity);
    E get(String id);
    void delete(String id);
    void update(String id, E entity);
    List<E> list();
}
