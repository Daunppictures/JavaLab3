package ua.lviv.iot.athletics.rest.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.athletics.rest.model.AbstractAthletics;

@Repository
public interface AthleticRepository extends JpaRepository<AbstractAthletics, Integer> {

}