package com.myCity.incident;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/incident")
public class IncidentController {

    @Autowired
    private IncidentRepository incidentRepository;

    @GetMapping
    public Iterable<Incident> getIncidents() {
        return incidentRepository.findAll();
    }

    @GetMapping("/{incidentId}")
    public Optional<Incident> getIncident(@PathVariable("incidentId") int incidentId) {
        return incidentRepository.findById(incidentId);
    }

}
