package side_project.ranking_system.repository;

import org.springframework.stereotype.Component;
import side_project.ranking_system.domain.Member;

import java.util.ArrayList;
import java.util.List;

@Component
public class RankRepository implements MemberRepository{
    private static List<Member> memberList = new ArrayList<>();
    @Override
    public void save(Member member) {
        memberList.add(member);
    }

    @Override
    public Member findByRank(int rank) {
        return memberList.get(rank - 1);
    }

    @Override
    public List<Member> getMemberList() {
        return memberList;
    }
}
