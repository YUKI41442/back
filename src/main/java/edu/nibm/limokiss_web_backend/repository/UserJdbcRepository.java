package edu.nibm.limokiss_web_backend.repository;

import edu.nibm.limokiss_web_backend.entity.UserEntity;

public interface UserJdbcRepository {
    boolean userExistsByEmail(String email);
    UserEntity login(String email);
}
