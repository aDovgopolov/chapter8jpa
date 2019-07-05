package com.apress.prospring5.ch8.jpaFirstPart.repos;

import java.util.List;

import com.apress.prospring5.ch8.jpaFirstPart.entities.Singer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SingerRepository extends JpaRepository<Singer, Long> {
    List<Singer> findByFirstName(String firstName);
    List<Singer> findByFirstNameAndLastName(String firstName, String lastName);

}
