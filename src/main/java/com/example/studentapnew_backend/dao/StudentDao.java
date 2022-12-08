package com.example.studentapnew_backend.dao;

import com.example.studentapnew_backend.model.Students;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentDao extends CrudRepository<Students, Integer > {
    @Query(value = "SELECT `id`, `admn_no`, `clg_name`, `cpassword`, `name`, `parent_mob_no`, `parent_name`, `password`, `roll_no`, `username` FROM `students` WHERE `admn_no` = :admnNo",nativeQuery = true)
    List<Students> search(@Param("admnNo") Integer admnNo);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `students` WHERE `admnNo` = :admnNo",nativeQuery = true)
    void delete(@Param("admnNo") Integer admnNo);


}
