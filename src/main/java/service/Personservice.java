package service;
import java.util.Hashtable;

import org.springframework.stereotype.Service;

import model.Person;

@Service //Stander spring annotation
public class Personservice {
Hashtable<String,Person> persons = new Hashtable<String,Person>();//String key and person object
	
public Personservice() //Constructor
{
Person p = new Person();
	p.setId("1");
	p.setFname("Steve");
	p.setLname("Black");
	p.setAge(78);
	persons.put("1", p);
	
	p = new Person();
	p.setId("2");
	p.setFname("William");
	p.setLname("Scott");
	p.setAge(45);
	persons.put("2", p);
}
public Person getPerson(String id) {
	if(persons.containsKey(id))
		return persons.get(id);
	else 
		return null;
}
public Hashtable<String,Person> getAll(){
	
	return persons;
}
}
