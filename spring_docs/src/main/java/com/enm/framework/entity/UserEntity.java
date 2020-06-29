package com.enm.framework.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Table(name = "userInfo")
public class UserEntity implements Serializable {

	public UserEntity() {

	}
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long no;
	@Column(name = "user_id")
	private String userId;
	private Long age;
	private String name;
	@Email
	private String email;
}
