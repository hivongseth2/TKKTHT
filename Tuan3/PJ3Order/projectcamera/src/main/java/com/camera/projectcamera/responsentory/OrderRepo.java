package com.camera.projectcamera.responsentory;

import com.camera.projectcamera.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
    public interface OrderRepo extends JpaRepository<Order,Long>
    {
//        Role findRoleByRoleName(String roleName);
//
//        @Query(nativeQuery = true, value = "")
//        List<Role> findAllRole();
    }

