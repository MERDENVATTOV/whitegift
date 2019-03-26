package com.wg.whitegift.repository;

import com.wg.whitegift.entity.MyPolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyPolicyRepository extends JpaRepository<MyPolicy, Long> {
    MyPolicy findMyPolicyById(int holder);
}
