package side_project.ranking_system.service;

import side_project.ranking_system.domain.Member;

public interface RankService {
    void showRank();
    void addRank();
    Member findByRank(int rank);
    int findByName(String name);
}
