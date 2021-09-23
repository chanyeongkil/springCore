package cykil.springCore.discount;

import cykil.springCore.member.Grade;
import cykil.springCore.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{
    private int discountRate = 10;
    @Override
    public int discount(Member member, int price) {
        // VIP 등급일 경우 할인 적용
        if(member.getGrade() == Grade.VIP){
            return price * discountRate/100;
        }else{
            return 0;
        }
    }
}
