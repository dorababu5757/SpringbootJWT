package com.callmanagement;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncode {

	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		System.out.println(bCryptPasswordEncoder.encode("drl"));
	}
}
