package cykil.springCore;

import cykil.springCore.member.Grade;
import cykil.springCore.member.Member;
import cykil.springCore.member.MemberService;
import cykil.springCore.member.MemberServiceImpl;
import cykil.springCore.order.Order;
import cykil.springCore.order.OrderService;
import cykil.springCore.order.OrderServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);

		Long memberId = 1L;

		MemberService memberService = new MemberServiceImpl();
		OrderService orderService = new OrderServiceImpl();

		Member member = new Member(memberId, "memberA", Grade.VIP);
		memberService.join(member);

		Order order = orderService.createOrder(memberId, "ITEM_A", 10000);

		System.out.println("order = " + order);
	}

}
