package com.enm.framework.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.enm.framework.entity.UserEntity;
import com.enm.framework.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;

	public List<UserEntity> findAll() {
		return userRepository.findAll();
	}

	public UserEntity save(UserEntity entity) {
		return userRepository.save(entity);
	}

	@Transactional
	public Integer deleteByNo(Long no) {
		return userRepository.deleteByNo(no);
	}
}
