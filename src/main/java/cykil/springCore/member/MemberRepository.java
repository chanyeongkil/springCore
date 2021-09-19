package cykil.springCore.member;

/** 회원 저장소 Interface
 *  아직 회원저장소를 어떻게 구현할지 구체화되지 않았다.(DB 구축 또는 외부 시스템과 연동될 수 있음)
 *  따라서, 회원 저장소가 가져야할 기능들에 대해서만 정의한다.
 *  정의한 기능의 구체화는 저장소 인터페이스를 구현하는 클래스에서 수행된다.
 *  >>> 기능에 대한 정의만 해두고 구체적인 내용은 상속하는 쪽에서 채워 넣는다.
 * **/
public interface MemberRepository {
    void save(Member member); // 회원 저장 메서드
    Member findById(long memberId); // 회원 ID 조회 메서드
}
