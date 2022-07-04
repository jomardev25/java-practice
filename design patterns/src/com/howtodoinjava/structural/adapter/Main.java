package com.howtodoinjava.structural.adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * System.in provides byte stream where BufferedReader expects character stream. This two are incompatible.
 * This is the ideal situation to put a adapter in between two incompatible interfaces.
 * InputStreamReader does exactly this thing and works adapter between System.in and BufferedReader.
 */

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter String: ");
		String s;
		try {
			s = br.readLine();
			System.out.print("Inputted String : " + s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
