package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

//import org.junit.jupiter.api.Assertions; // 방법 1
//import org.assertj.core.api.Assertions; // 방법 2 - 1
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;


public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    // 테스트가 실행이 되고 끝날 때마다,
    // 저장소를 다 지운다
    // => 테스트내에서 객체 생성한 것들이 서로 영향을 주지 않게 될 수 있다

    // 각각의 테스트는 순서와 상관없이 정상작동되어야한다.
    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");
        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        // 방법1
//        Assertions.assertEquals(result, member);
        // 방법2 - 1
//        Assertions.assertThat(member).isEqualTo(result);
        // 방법2 - 2 (Assertions 매번 칠 필요 없이 바로 가능)
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        // member1 위에서 shift + f6 누르면, 전체적으로 쉽고 빠르게 바꾸기 가능
        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();
        assertThat(result).isEqualTo(member1);

    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        // member1 위에서 shift + f6 누르면, 전체적으로 쉽고 빠르게 바꾸기 가능
        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();
        assertThat(result.size()).isEqualTo(3);

    }

}
