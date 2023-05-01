package side_project.ranking_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import side_project.ranking_system.domain.Member;
import side_project.ranking_system.repository.MemberRepository;

@Component
public class RegisterServiceImpl implements RegisterService{
    private final MemberRepository memberRepository;

    @Autowired
    public RegisterServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void register(Member member) {
        memberRepository.save(member);
    }
}
