package side_project.ranking_system.rankpolicy;

import org.springframework.beans.factory.annotation.Autowired;
import side_project.ranking_system.domain.Member;
import side_project.ranking_system.repository.MemberRepository;
import side_project.ranking_system.repository.RankRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RankShowPolicy implements RankPolicy{
    private final MemberRepository memberRepository;
    private final int RANK = 1;

    @Autowired
    public RankShowPolicy(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void rankSort(List<Member> memberList) {
        Collections.sort(memberList, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o2.getScore() - o1.getScore();
            }
        });
    }
}
