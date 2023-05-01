package side_project.ranking_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import side_project.ranking_system.domain.Member;
import side_project.ranking_system.rankpolicy.RankPolicy;
import side_project.ranking_system.repository.MemberRepository;

import java.util.List;

public class RankServiceImpl implements RankService{
    private final MemberRepository memberRepository;
    private final RankPolicy rankPolicy;
    private int rank = 1;

    @Autowired
    public RankServiceImpl(MemberRepository memberRepository, RankPolicy rankPolicy) {
        this.memberRepository = memberRepository;
        this.rankPolicy = rankPolicy;
    }

    @Override
    public void showRank() {
        List<Member> memberList = memberRepository.getMemberList();

        for(int i = 0; i < memberList.size(); i++) {
            System.out.println(memberList.get(i).getName()
                    + " " + memberList.get(i).getScore()
                    + " " + memberList.get(i).getRank()
            );
        }
    }

    @Override
    public void addRank() {
        List<Member> memberList = memberRepository.getMemberList();
        rankPolicy.rankSort(memberList);

        for(int i = 0; i < memberList.size(); i++) {
            memberList.get(i).setRank(rank++);
        }
    }

    @Override
    public Member findByRank(int rank) {
        return memberRepository.getMemberList().get(rank - 1);
    }

    @Override
    public int findByName(String name) {
        List<Member> memberList = memberRepository.getMemberList();

        for(int i = 0; i < memberList.size(); i++) {
            if(memberList.get(i).getName().equals(name)) {
                return memberList.get(i).getRank();
            }
        }

        return -1;
    }
}
