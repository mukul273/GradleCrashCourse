package com.newbie.main;

import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

public class HelloWorld {

	public HelloWorld() {
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		System.out.println(StringUtils.swapCase(Arrays.toString(args)));
	}
}
