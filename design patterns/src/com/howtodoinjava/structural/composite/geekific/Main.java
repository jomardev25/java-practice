package com.howtodoinjava.structural.composite.geekific;

public class Main {

	public static void main(String[] args) {

		CompositeBox order1 = new CompositeBox(
								new Book("Book 1", 200),
								new Book("Book 2", 200)
							);
		CompositeBox order2 = new CompositeBox(
								new Book("Book 3", 300),
								new Book("Book 4", 300),
								new CompositeBox(
									new VideoGame("Game 1", 300),
									new VideoGame("Game 2", 300)
								)
							);

		DeliveryService deliveryService = new DeliveryService();
		deliveryService.setupOrder(order1, order2);

		System.out.println(deliveryService.calculateOrderPrice());

//		Box box = new Box(
//					Arrays.asList(
//						new Box(
//							Arrays.asList(
//								new Box(
//									Arrays.asList(
//										new Box(
//											Collections.emptyList(),
//											Arrays.asList(
//												new Product("16", 100),
//												new Product("17", 100),
//												new Product("18", 100)
//											)
//										)
//									),
//									Arrays.asList(
//										new Product("10", 100),
//										new Product("11", 100),
//										new Product("12", 100)
//									)
//								),
//								new Box(
//									Collections.emptyList(),
//									Arrays.asList(
//										new Product("13", 100),
//										new Product("14", 100),
//										new Product("15", 100)
//									)
//								)
//							),
//							Arrays.asList(
//								new Product("1", 100),
//								new Product("2", 100),
//								new Product("3", 100)
//							)
//						),
//						new Box(
//							Collections.emptyList(),
//							Arrays.asList(
//								new Product("4", 100),
//								new Product("5", 100),
//								new Product("6", 100)
//							)
//						)
//					),
//
//					Arrays.asList(
//						new Product("7", 100),
//						new Product("8", 200),
//						new Product("9", 100)
//					)
//				);
//
//		System.out.println(box.calculatePrice());
//		displayMenu();

	}


//	private static void displayMenu() {
//		List<Menu> menus = Arrays.asList(
//							new Menu(
//								"Dashboard",
//								"/dashboard",
//								Collections.emptyList()
//							),
//							new Menu(
//								"Talent Aquisition",
//								"#",
//								Arrays.asList(
//									new Menu(
//										"Employee Requisition",
//										"/requisition",
//										Arrays.asList(
//											new Menu(
//												"Creation Requisition",
//												"/create",
//												Collections.emptyList()
//											),
//											new Menu(
//												"Requisition List",
//												"/list",
//												Collections.emptyList()
//											),
//											new Menu(
//												"Applicants",
//												"/applicants",
//												Collections.emptyList()
//											),
//											new Menu(
//												"ITAP",
//												"/itap",
//												Collections.emptyList()
//											),
//											new Menu(
//												"On Boarding",
//												"/on-boarding",
//												Collections.emptyList()
//											),
//											new Menu(
//												"Off Boarding",
//												"/off-boarding",
//												Collections.emptyList()
//											)
//										)
//									)
//								)
//							),
//							new Menu(
//								"Menu 1",
//								"/menu-1",
//								Arrays.asList(
//									new Menu(
//										"Sub level 1",
//										"/level-1",
//										Arrays.asList(
//											new Menu(
//												"Sub level 2",
//												"/level-2",
//												Arrays.asList(
//													new Menu(
//														"Sub level 3",
//														"/level-3",
//														Arrays.asList(
//
//														)
//													)
//												)
//											)
//										)
//									)
//								)
//							)
//						);
//
//		System.out.println(menus.toString());
//	}

}
