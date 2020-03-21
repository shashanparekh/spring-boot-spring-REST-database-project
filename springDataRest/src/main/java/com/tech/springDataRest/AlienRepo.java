package com.tech.springDataRest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.tech.springDataRest.model.ALien;

@RepositoryRestResource(collectionResourceRel ="aliens",path="aliens")
public interface AlienRepo extends JpaRepository<ALien, Integer> {

}
