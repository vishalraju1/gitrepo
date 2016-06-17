package com.codevad.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.codevad.Person;

@Component
public class PersonService implements IPersonService {
	@Override
	public Person getPersonDetail(Integer id){
		Person p = new Person();
		p.setId(id);
		p.setLocation("Vadodara");
		p.setName("Jigar");
		return p;
	}

	@Override
	public List<Person> getListPersons() {
		List<Person> listPerosns=new ArrayList<Person>();
		
		Person p = new Person();
		p.setId(1);
		p.setLocation("Vadodara");
		p.setName("Jigar");
		
		listPerosns.add(p);
		
		Person p2 = new Person();
		p2.setId(2);
		p2.setLocation("Vadodara");
		p2.setName("Vishal");
		
		listPerosns.add(p2);
		
		Person p3 = new Person();
		p3.setId(3);
		p3.setLocation("Baroda");
		p3.setName("Yougesh");
		
		listPerosns.add(p3);
		return listPerosns;
		
	}
}
