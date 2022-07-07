package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	private static List<Person> persons;

	static {
		persons = Arrays.asList(
			new Person(1, "John Doe", "johndoe@gmail.com"),
			new Person(2, "Jane Doe", "jane@gmail.com"),
			new Person(3, "James Smith", "james@gmail.com"),
			new Person(3, "James Smith", "james@gmail.com")
		);
	}


	public static void main(String[] args) {
		List<Person> personFilter = persons
								.stream()
								.filter(person -> person.getEmail().equals("jane@gmail.com"))
								.collect(Collectors.toList());

		List<String> emails = persons
								.stream()
								.map(person -> person.getEmail())
								.collect(Collectors.toList());

		Long count = persons
						.stream()
						.count();

		List<Person> distinctPerson = persons
										.stream()
										.distinct()
										.collect(Collectors.toList());

		System.out.println(personFilter);
		System.out.println(emails);
		System.out.println(count);
		System.out.println(distinctPerson);

		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8,9);

		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

		System.out.println(listOfLists);

		List<Integer> listOfAllIntegers = listOfLists.stream()
								          .flatMap(x -> x.stream().filter(y -> y > 3))
								          .filter(x -> x > 5)
								          .collect(Collectors.toList());

		System.out.println(listOfAllIntegers);


	}

}


class Person {

	private Integer id;
	private String name;
	private String email;

	public Person() {
	}

	public Person(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
