package ca.gbc.comp3095.petclinic.services;

import ca.gbc.comp3095.petclinic.modle.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}