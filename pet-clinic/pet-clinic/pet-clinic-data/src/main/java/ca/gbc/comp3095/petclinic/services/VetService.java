package ca.gbc.comp3095.petclinic.services;

import ca.gbc.comp3095.petclinic.modle.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}