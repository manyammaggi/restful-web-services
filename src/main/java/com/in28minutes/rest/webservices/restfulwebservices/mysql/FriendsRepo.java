package com.in28minutes.rest.webservices.restfulwebservices.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendsRepo extends JpaRepository<Friends, Long> {

}
