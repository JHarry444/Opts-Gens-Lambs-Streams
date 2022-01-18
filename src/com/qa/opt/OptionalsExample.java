package com.qa.opt;

import java.util.List;
import java.util.Optional;

import javax.management.AttributeNotFoundException;

public class OptionalsExample {

	private List<String> list = List.of("Harry", "Sally", "Barry");

	private Optional<String> find(String s) {
		for (String name : this.list) {
			if (name.equals(s)) {
				return Optional.of(name);
			}
		}
		return Optional.empty();
	}

	public static void main(String[] args) throws AttributeNotFoundException {

		OptionalsExample o = new OptionalsExample();

		Optional<String> whatsInTheBox = o.find("Barry");
//		whatsInTheBox.orElseThrow(ThreadDeath::new);
		String found = whatsInTheBox.orElseGet(() -> {
			System.out.println("Name not found");
			return "Bloop";
		});

		System.out.println(found);
		System.out.println(found.length());

	}

}
