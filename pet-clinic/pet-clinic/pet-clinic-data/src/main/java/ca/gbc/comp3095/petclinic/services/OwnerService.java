package ca.gbc.comp3095.petclinic.services;

import ca.gbc.comp3095.petclinic.modle.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastname(String lastname);

}
