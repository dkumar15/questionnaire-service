package com.questionnaire.repositories;

import com.questionnaire.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmailIdAndMobileNo(String emailId, String mobileNo);
}
