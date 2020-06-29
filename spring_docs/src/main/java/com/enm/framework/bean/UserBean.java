package com.enm.framework.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long no;
	private String userId;
	private Long age;
	private String name;
	private String email;

}
