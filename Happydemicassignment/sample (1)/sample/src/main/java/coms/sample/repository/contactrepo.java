package coms.sample.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.sample.model.contactus;

@Repository
public interface contactrepo extends JpaRepository<contactus,Integer>{

}