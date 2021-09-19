package cykil.springCore.order;

import cykil.springCore.discount.DiscountPolicy;
import cykil.springCore.discount.FixDiscountPolicy;
import cykil.springCore.member.Member;
import cykil.springCore.member.MemberRepository;
import cykil.springCore.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{
    private static final MemberRepository memberRepository = new MemoryMemberRepository();
    private static final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member findMember = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(findMember, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
