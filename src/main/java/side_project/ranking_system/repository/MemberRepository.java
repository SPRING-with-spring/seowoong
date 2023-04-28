package side_project.ranking_system.repository;

import side_project.ranking_system.domain.Member;

import java.util.List;

public interface MemberRepository {
    void save(Member member);
    Member findByRank(int rank);
    List<Member> getMemberList();
}
