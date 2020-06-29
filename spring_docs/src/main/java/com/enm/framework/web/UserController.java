package com.enm.framework.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enm.framework.entity.UserEntity;
import com.enm.framework.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@GetMapping("/findAll")
	public List<UserEntity> findAll() {
		return userService.findAll();
	}

	@PostMapping("/save")
	public UserEntity save(UserEntity entity) {
		return userService.save(entity);
	}

	@DeleteMapping("/deleteByNo/{no}")
	public Integer deleteByNo(@PathVariable Long no) {
		return userService.deleteByNo(no);
	}
}
