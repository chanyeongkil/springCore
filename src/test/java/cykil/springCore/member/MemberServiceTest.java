package cykil.springCore.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    @Test
    void 회원가입_join(){
        // given - 준비
        Member member = new Member(1L, "MEMBER_A", Grade.VIP);

        // when - 실행
        MemberService memberService = new MemberServiceImpl();
        memberService.join(member);
        Member findMember = memberService.findById(1L);

        // then - 검증
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
