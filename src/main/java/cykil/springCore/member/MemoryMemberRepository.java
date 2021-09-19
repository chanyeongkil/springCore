package cykil.springCore.member;


import java.util.HashMap;
import java.util.Map;

/**
 * MemberRepository를 상속 받는 쪽에서 메소드에 대한 구체적인 정의를 한다.
 *
 * **/
public class MemoryMemberRepository implements MemberRepository{
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(long memberId) {
        return store.get(memberId);
    }
}
