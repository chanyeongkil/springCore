package cykil.springCore;

import cykil.springCore.discount.DiscountPolicy;
import cykil.springCore.discount.FixDiscountPolicy;
import cykil.springCore.discount.RateDiscountPolicy;
import cykil.springCore.member.MemberRepository;
import cykil.springCore.member.MemberService;
import cykil.springCore.member.MemberServiceImpl;
import cykil.springCore.member.MemoryMemberRepository;
import cykil.springCore.order.OrderService;
import cykil.springCore.order.OrderServiceImpl;

public class AppConfig {

    /*public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new RateDiscountPolicy());
    }*/

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy(){
        //return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
