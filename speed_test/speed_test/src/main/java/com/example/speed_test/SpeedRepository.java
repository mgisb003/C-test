package com.example.speed_test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SpeedRepository extends JpaRepository<SpeedResult, Integer>{

}
