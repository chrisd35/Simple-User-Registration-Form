package com.chris.BackendPortion.repository;

import com.chris.BackendPortion.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
