package com.wg.whitegift.repository;

import com.wg.whitegift.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {
    MyUser findMyUserById(int id);
}
