package side_project.ranking_system.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import side_project.ranking_system.domain.Member;
import side_project.ranking_system.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository memberRepository;

    public Member login(String loginId, String loginPassword) {
        return memberRepository.findByLoginId(loginId)
                .filter(m -> m.getPassword().equals(loginPassword))
                .orElse(null);
    }
}
