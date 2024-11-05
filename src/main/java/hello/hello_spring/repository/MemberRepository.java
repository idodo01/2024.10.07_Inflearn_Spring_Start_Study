package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findById(Long id); // java8 기능, null 값을 그대로 반호나하는 대신에 감싸서 반환함
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
