package ca.gbc.comp3095.petclinic.services.map;

import ca.gbc.comp3095.petclinic.modle.Pet;
import ca.gbc.comp3095.petclinic.services.CrudService;

import java.util.Set;

public class PetMapService extends AbstractServiceMap<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deletebyId(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
