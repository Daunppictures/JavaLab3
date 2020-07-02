package ua.lviv.iot.athletics.rest.bussiness;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.athletics.rest.dataaccess.AthleticRepository;
import ua.lviv.iot.athletics.rest.model.Running;

@Service
public class AthleticService {

  @Autowired
    private AthleticRepository athleticRepository;

  public Running createAthletic(Running running) {
    return athleticRepository.save(running);
  }

  public List<Running> findAll() {
    return athleticRepository.findAll();
  }

  public List<Running> getAllByTypesOfRunning(String typesOfRunning) {
    return athleticRepository.findAllByTypesOfRunning(typesOfRunning);
  }

  public List<Running> getRunnings() {
    return athleticRepository.findAll();
  }

  public Running getRunning(Integer id) {
    if (athleticRepository.existsById(id)) {
        return athleticRepository.findById(id).get();
    } else {
        return null;
    }
  }

  public Running updateRunning(Integer id, Running running) {
    if (athleticRepository.existsById(id)) {
        Running updateRunning = athleticRepository.findById(id).get();
        athleticRepository.save(running);
        return updateRunning;
    } else {
        return null;
    }
  }

  public boolean deleteRunning(Integer id) {
    if (athleticRepository.existsById(id)) {
        athleticRepository.deleteById(id);
        return true;
    } else {
        return false;
    }
  }

}
