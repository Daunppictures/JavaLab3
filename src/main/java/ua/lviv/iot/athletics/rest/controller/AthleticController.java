package ua.lviv.iot.athletics.rest.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

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
    
    private Map<Integer, Running> runnings = new HashMap<Integer, Running>();
    
    private AtomicInteger idCounter = new AtomicInteger();
    
    @Autowired
    private AthleticService athleticService;
    
    @GetMapping
    public List<Running> getAllAthletics() {
        return new LinkedList<>(runnings.values());
    }
    
    @GetMapping(path = "/{id}")
    public Running getAthletic(final @PathVariable("id") Integer runningId) {
        return runnings.get(runningId);
    }
    
    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public Running createAthletic(final @RequestBody Running running) {
        
        System.out.println(athleticService.createAthletic(running));

        running.setId(idCounter.incrementAndGet());
        runnings.put(running.getId(), running);
        return running;
    }
    
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Running> deleteAthletic(@PathVariable("id") Integer runningId) {
        HttpStatus status = runnings.remove(runningId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }
    
    @PutMapping(path = "/{id}")
    public ResponseEntity<Running> updateAthletic(final @PathVariable("id") Integer runningId,
            final @RequestBody Running running) {
        HttpStatus status;
        running.setId(runningId);
        if (runnings.containsKey(runningId)) {
            runnings.put(runningId, running);
            status = HttpStatus.OK;
        } else {
            status = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<Running>(running, status);
    }
}
