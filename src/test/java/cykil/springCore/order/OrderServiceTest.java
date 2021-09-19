package cykil.springCore.order;

import cykil.springCore.member.Grade;
import cykil.springCore.member.Member;
import cykil.springCore.member.MemberService;
import cykil.springCore.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();
    @Test
    void 주문생성_테스트(){
        // 준비
        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        // 실행
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        // 결과
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(999);
    }
}
