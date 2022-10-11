package ca.gbc.comp3095.petclinic.services;

import java.util.Set;

public interface CrudService <T, ID>{ //T specifies the model, ID specifies our primary key
    Set<T> findAll();
    T findById(ID id);
    T save(T object); //We return the generic T so that the T that returns back has a generated primary key
    void delete(T object);
    void deletebyId(ID id);
}
