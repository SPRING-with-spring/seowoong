package side_project.ranking_system.service;

import side_project.ranking_system.domain.Member;

public interface RegisterService {
    void register(Member member);
    Member findByRank(int rank);
}
