package ca.gbc.comp3095.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AbstractServiceMap<T, ID>{
    protected Map<ID, T> map = new HashMap<>();
    Set<T> findAll() {
        return new HashSet<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }
    T save(ID id, T object){
        map.put(id, object);
        return object;
    }
    void deleteById(ID id){
        map.remove(id);
    }
    void delete(T object){

    }
}
