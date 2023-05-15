package com.picpal.tester.api.prepare.repository;

import com.picpal.tester.api.prepare.model.PrepareEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrepareRepository extends JpaRepository<PrepareEntity,Integer> {

}
