package ca.gbc.comp3095.petclinic.services.map;

import ca.gbc.comp3095.petclinic.modle.Vet;
import ca.gbc.comp3095.petclinic.services.CrudService;

import java.util.Set;

public class VetMapService extends AbstractServiceMap<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deletebyId(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
