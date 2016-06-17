package com.codevad.component;

import java.util.List;

import com.codevad.Person;

public interface IPersonService {
  public Person getPersonDetail(Integer id);
  
  public List<Person> getListPersons();
}
