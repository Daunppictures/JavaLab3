package ua.lviv.iot.athletics.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.athletics.rest.bussiness.AthleticService;
import ua.lviv.iot.athletics.rest.model.Running;

@RequestMapping("/athletics")
@RestController
public class AthleticController {

    @Autowired
    private AthleticService athleticService;

    @GetMapping
    public List<Running> getAllAthletics() {
        return athleticService.getRunnings();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Running> getAthletic(final @PathVariable("id") Integer runningId, Running running) {
        ResponseEntity<Running> status = (running = athleticService.getRunning(runningId)) == null 
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND) 
                : new ResponseEntity<>(running, HttpStatus.OK);
        return status;
    }

    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public Running createAthletic(final @RequestBody Running running) {
        return athleticService.createAthletic(running);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Running> deleteAthletic(@PathVariable("id") Integer runningId) {
        HttpStatus status = athleticService.deleteRunning(runningId) ? HttpStatus.NOT_FOUND
                : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Running> updateAthletic(final @PathVariable("id") Integer runningId,
            final @RequestBody Running running) {
       running.setId(runningId);
       Running updateRunning = athleticService.updateRunning(runningId, running);
       ResponseEntity<Running> status = updateRunning == null 
               ? new ResponseEntity<Running>(HttpStatus.NOT_FOUND)
               : new ResponseEntity<Running>(HttpStatus.OK);
       return status;
    }
}
