package com.example.myappjwtauthspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.myappjwtauthspring.models.Role;
import com.example.myappjwtauthspring.models.ERole;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
