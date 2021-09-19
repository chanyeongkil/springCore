package cykil.springCore.member;

public interface MemberService {
    void join(Member member);
    Member findById(long memberId);
}
