package com.thoughtworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryRepository<E> implements Repository<E> {
    private Map<String, E> map= new HashMap<>();
    @Override
    public void save(String id, E entity) {
        map.put(id, entity);
    }

    @Override
    public E get(String id) {
        return map.get(id);
    }

    @Override
    public void delete(String id) {
        map.remove(id);
    }

    @Override
    public void update(String id, E entity) {
        map.replace(id, entity);
    }

    @Override
    public List<E> list() {
        List<E> list = new ArrayList<>();
        for (String s : map.keySet()) {
            list.add(map.get(s) );
        }
        return list;
    }
}
