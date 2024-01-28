package com.camera.projectcamera.responsentory;

import com.camera.projectcamera.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
    public interface RoleRepo extends JpaRepository<User,Long>
    {
//        Role findRoleByRoleName(String roleName);
//
//        @Query(nativeQuery = true, value = "")
//        List<Role> findAllRole();
    }

