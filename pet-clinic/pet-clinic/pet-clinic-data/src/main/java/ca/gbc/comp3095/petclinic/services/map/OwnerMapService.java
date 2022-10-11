package ca.gbc.comp3095.petclinic.services.map;

import ca.gbc.comp3095.petclinic.modle.Owner;
import ca.gbc.comp3095.petclinic.services.CrudService;

import java.util.Set;

public class OwnerMapService extends AbstractServiceMap<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deletebyId(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
