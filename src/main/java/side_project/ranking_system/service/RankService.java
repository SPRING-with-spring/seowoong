package side_project.ranking_system.service;

import org.springframework.stereotype.Service;
import side_project.ranking_system.domain.Member;

@Service
public interface RankService {
    void showRank();
    void addRank();
    Member findByRank(int rank);
    int findByName(String name);
}
