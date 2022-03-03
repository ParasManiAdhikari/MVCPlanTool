package de.luebeck.plantool.repositories;

import de.luebeck.plantool.entities.Role;
import de.luebeck.plantool.entities.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
