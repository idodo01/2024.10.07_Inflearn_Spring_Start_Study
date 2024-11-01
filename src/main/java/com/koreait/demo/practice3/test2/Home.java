package com.koreait.demo.practice3.test2;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@ToString
@Component
public class Home {
    @Autowired
    @Qualifier("person1")
    private Person person;
    @Autowired
    private List<Person> persons;


}

