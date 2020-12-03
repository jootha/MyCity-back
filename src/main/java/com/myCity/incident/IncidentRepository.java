package com.myCity.incident;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "incident")
public interface IncidentRepository extends JpaRepository<Incident, Integer> {
}
