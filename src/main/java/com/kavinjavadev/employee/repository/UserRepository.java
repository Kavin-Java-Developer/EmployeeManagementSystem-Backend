package com.kavinjavadev.employee.repository;

import com.kavinjavadev.employee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
