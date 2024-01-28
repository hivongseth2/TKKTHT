package com.camera.projectcamera.responsentory;

import com.camera.projectcamera.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
    public interface ProductRepo extends JpaRepository<Product,Long>
    {
//        Role findRoleByRoleName(String roleName);
//
//        @Query(nativeQuery = true, value = "")
//        List<Role> findAllRole();
    }

