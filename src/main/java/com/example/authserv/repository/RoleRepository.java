package com.example.authserv.repository;


import com.example.authserv.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository  extends JpaRepository<Role, Long> {

    @Query(value = "SELECT * FROM role u Where u.name=?1", nativeQuery = true)
    Role findRole(String name);
}
