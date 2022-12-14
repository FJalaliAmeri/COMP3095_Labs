package ca.gbc.comp3095.petclinic.services.map;

import ca.gbc.comp3095.petclinic.model.Pet;
import ca.gbc.comp3095.petclinic.services.CrudService;
import ca.gbc.comp3095.petclinic.services.PetService;
import ca.gbc.comp3095.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMapService extends AbstractServiceMap<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {return super.save(object);}

    @Override
    public void deletebyId(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
