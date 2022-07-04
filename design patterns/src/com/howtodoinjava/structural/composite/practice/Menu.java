package com.howtodoinjava.structural.composite.practice;

import java.util.Arrays;
import java.util.List;

interface Menu {

	void getLabelAndPath();

	String getLabel();

	String getPath();

}

class MenuLeaf implements Menu {

	private final String label;
	private final String path;

	public MenuLeaf(String label, String path) {
		this.label = label;
		this.path = path;
	}

	public String getLabel() {
		return label;
	}

	public String getPath() {
		return path;
	}

	public void getLabelAndPath() {
		System.out.println("Label: " + label + " Path: " + path);
	}

	@Override
	public String toString() {
		return "MenuComposite [label=" + label + ", path=" + path;
	}

}

class MenuComposite implements Menu {

	private final String label;
	private final String path;
	private final List<Menu> menuList;

	public MenuComposite(String label, String path, List<Menu> menus) {
		this.label = label;
		this.path = path;
		this.menuList = menus;
	}

	public void addComponents(Menu... menus) {
		this.menuList.addAll(Arrays.asList(menus));
	}

	public String getLabel() {
		return label;
	}

	public String getPath() {
		return path;
	}

	public void getLabelAndPath() {
		System.out.println("Label: " + label + " Path: " + path);
		for (Menu menu : menuList) {
			System.out.println("Label: " + menu.getLabel() + " Path: " + menu.getPath());
		}
	}

	@Override
	public String toString() {
		return "MenuComposite [label=" + label + ", path=" + path + ", menuList=" + menuList + "]";
	}

}




