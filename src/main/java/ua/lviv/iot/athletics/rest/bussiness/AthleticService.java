package ua.lviv.iot.athletics.rest.bussiness;

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

}
