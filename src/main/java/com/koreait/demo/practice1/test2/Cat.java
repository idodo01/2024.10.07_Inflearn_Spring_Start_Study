package com.koreait.demo.practice1.test2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@ToString
@Component
public class Cat {
    private String nick;
    private List<Integer> numbers;
    private Map<String, String> dataMap;
    private Set<Integer> dataSet;
}







