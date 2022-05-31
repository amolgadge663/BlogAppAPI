package com.amolsoftwares.blogappapi.repository;

import com.amolsoftwares.blogappapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
