package immutable;

import java.util.Collections;
import java.util.List;

public final class Immutable	{
	
	private final String name;
	private final int age;
	private final List<String> roles;
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Object getRoles() {
		return Collections.unmodifiableList(roles);
	}
	
	public Immutable(String name, int age, List<String> roles) {
		this.name = name;
		this.age = age;
		this.roles = roles;
	}
	
	
	
	
}