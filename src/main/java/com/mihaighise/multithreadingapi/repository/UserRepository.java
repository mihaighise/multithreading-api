package com.mihaighise.multithreadingapi.repository;

import com.mihaighise.multithreadingapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
