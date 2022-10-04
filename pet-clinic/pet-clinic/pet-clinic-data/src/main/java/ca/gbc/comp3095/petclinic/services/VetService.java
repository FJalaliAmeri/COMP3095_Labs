package ca.gbc.comp3095.petclinic.services;

import ca.gbc.comp3095.petclinic.modle.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet); //so that the vet that returns back has a generated primary key
    Set<Vet> findAll();
}
