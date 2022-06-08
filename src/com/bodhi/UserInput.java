package com.bodhi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
	public static void main(String[] args) throws IOException {
		// try with resources
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String input = br.readLine();
			System.out.println(Integer.parseInt(input));
		}
	}
}
