package ua.lviv.iot.athletics.rest.dataaccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.athletics.rest.model.Running;

@Repository
public interface AthleticRepository extends JpaRepository<Running, Integer> {
    
    List<Running> findAllByTypesOfRunning(String typesOfRunning);
    
}