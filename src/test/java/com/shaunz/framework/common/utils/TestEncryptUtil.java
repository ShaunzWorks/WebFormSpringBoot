package com.shaunz.framework.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEncryptUtil {

	@Test
	public void encryptString() {
		System.out.println(EncryptUtil.encryptString("admin"));
	}
	
	@Test
	public void decryptString() {
		System.out.println(EncryptUtil.decryptString("ULoQAVLX2jJOb5EezLr0EA=="));
		System.out.println("\u0F16");
	}

}
