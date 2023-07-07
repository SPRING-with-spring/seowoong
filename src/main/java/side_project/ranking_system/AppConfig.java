package side_project.ranking_system;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import side_project.ranking_system.rankpolicy.RankPolicy;
import side_project.ranking_system.rankpolicy.RankShowPolicy;
import side_project.ranking_system.repository.MemberRepository;
import side_project.ranking_system.service.RankService;
import side_project.ranking_system.service.RankServiceImpl;
import side_project.ranking_system.service.RegisterService;
import side_project.ranking_system.service.RegisterServiceImpl;

@Configuration
public class AppConfig {
    @Bean
    public RegisterService registerService() {
        return new RegisterServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new RankRepository();
    }

    @Bean
    public RankService rankService() {
        return new RankServiceImpl(memberRepository(), rankPolicy());
    }

    @Bean
    public RankPolicy rankPolicy() {
        return new RankShowPolicy(memberRepository());
    }
}
