package cykil.springCore.discount;

import cykil.springCore.member.Grade;
import cykil.springCore.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discount = 999 ; // 1000원 할인(고정금액)

    @Override
    public int discount(Member member, int price) {
        // VIP 등급일 경우 할인 적용
        if(member.getGrade() == Grade.VIP){
            return discount;
        }else{
            return 0;
        }
    }
}
