package side_project.ranking_system.rankpolicy;

import side_project.ranking_system.domain.Member;

import java.util.List;

public interface RankPolicy {
    void rankSort(List<Member> memberList);
}
