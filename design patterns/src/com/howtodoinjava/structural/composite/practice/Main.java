package com.howtodoinjava.structural.composite.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Menu menuLeaf1 = new MenuLeaf("Dashboard", "/dashboard");


		List<Menu> subMenus = Arrays.asList(
								new MenuLeaf("Creation Requisition", "/create"),
								new MenuLeaf("Requisition List", "/list"),
								new MenuLeaf("Applicants", "/applicants"),
								new MenuLeaf("ITAP", "/itap")
							);

		MenuComposite menus = new MenuComposite(
								"Employee Requisition",
								"#",
								subMenus
							);


		MenuComposite mainMenu = new MenuComposite("", "", Collections.emptyList());
		mainMenu.addComponents(
			menuLeaf1,
			menus
		);

		mainMenu.getLabelAndPath();

	}
}
