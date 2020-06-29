package com.enm.framework.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.enm.framework.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	Integer deleteByNo(Long no);
}
