package side_project.ranking_system;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import side_project.ranking_system.domain.Member;
import side_project.ranking_system.service.RankService;
import side_project.ranking_system.service.RegisterService;

public class RankApp {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        RegisterService registerService =
                ac.getBean("registerService", RegisterService.class);
        RankService rankService = ac.getBean("rankService", RankService.class);

        Member member1 = new Member();
        member1.setName("최서웅"); member1.setScore(95);
        Member member2 = new Member();
        member2.setName("우상훈"); member2.setScore(85);
        Member member3 = new Member();
        member3.setName("김현용"); member3.setScore(90);
        Member member4 = new Member();
        member4.setName("안성재"); member4.setScore(65);
        Member member5 = new Member();
        member5.setName("송우진"); member5.setScore(80);
        Member member6 = new Member();
        member6.setName("정효준"); member6.setScore(50);
        Member member7 = new Member();
        member7.setName("최원석"); member7.setScore(35);
        Member member8 = new Member();
        member8.setName("신재성"); member8.setScore(45);
        Member member9 = new Member();
        member9.setName("이재현"); member9.setScore(55);
        Member member10 = new Member();
        member10.setName("정현준"); member10.setScore(30);

        registerService.register(member1);
        registerService.register(member2);
        registerService.register(member3);
        registerService.register(member4);
        registerService.register(member5);
        registerService.register(member6);
        registerService.register(member7);
        registerService.register(member8);
        registerService.register(member9);
        registerService.register(member10);

        rankService.addRank();
        rankService.showRank();

        System.out.println(rankService.findByRank(3).getName());
        System.out.println(rankService.findByName("최서웅"));
    }
}
