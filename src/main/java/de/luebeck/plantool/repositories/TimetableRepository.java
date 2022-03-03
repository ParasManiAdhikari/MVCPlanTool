package de.luebeck.plantool.repositories;

import de.luebeck.plantool.entities.TimeTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimetableRepository extends CrudRepository<TimeTable, Long> {
}
