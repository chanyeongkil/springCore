package cykil.springCore.order;

import cykil.springCore.discount.RateDiscountPolicy;
import cykil.springCore.member.Grade;
import cykil.springCore.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP회원은 10%의 할인률 적용")
    void member_VIP(){
        // 준비
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);

        // 실행
        int dc = discountPolicy.discount(member, 10000);
        // RateDiscountPolicy 클래스에 정의된 할인률 만큼 차감된다.

        // 결과
        assertThat(dc).isEqualTo(1000);
        System.out.println("RateDiscountPolicyTest.member_VIP");
        System.out.println("discount = " + dc);
    }

    @Test
    @DisplayName("일반회원은 할인률 미적용")
    void member_NORMAL(){
        // 준비
        long memberId = 99L;
        Member member = new Member(memberId, "memberN", Grade.BASIC);

        // 실행
        int dc = discountPolicy.discount(member, 10000);

        // 결과
        assertThat(dc).isNotEqualTo(1000);
        System.out.println("RateDiscountPolicyTest.member_VIP");
        System.out.println("discount = " + dc);

    }

}
