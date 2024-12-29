package edu.nibm.limokiss_web_backend.repository;

import edu.nibm.limokiss_web_backend.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Integer> {
}
