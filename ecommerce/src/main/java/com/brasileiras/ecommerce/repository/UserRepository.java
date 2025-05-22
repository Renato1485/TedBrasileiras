package com.brasileiras.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.brasileiras.ecommerce.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
