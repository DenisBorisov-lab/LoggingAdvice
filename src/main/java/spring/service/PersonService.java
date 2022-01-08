package spring.service;

import ru.otus.spring.domain.Person;

public interface PersonService {

    Person getByName(String name);
}
