package com.Database.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Database.demo.model.DatabaseModel;

public interface DatabaseRepository extends JpaRepository<DatabaseModel,Integer> {

}
