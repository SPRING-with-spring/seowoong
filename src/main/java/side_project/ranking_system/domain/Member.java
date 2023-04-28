package side_project.ranking_system.domain;

import lombok.*;

@Getter @Setter
@RequiredArgsConstructor
public class Member {
    private String name; // 이름
    private int score; // 점수
    private int rank; // 등수
}
