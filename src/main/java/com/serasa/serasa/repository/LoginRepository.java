package com.serasa.serasa.repository;

import com.serasa.serasa.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    public Optional<Login> findByUser(String user);
}
