package com.iamtry.togetherUpdate.schedule;

import com.iamtry.togetherUpdate.controller.news_ko.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {

    @Autowired
    private ChosunController chosunController;

    @Autowired
    private DongAController dongAController;

    @Autowired
    private HankyorehController hankyorehController;

    @Autowired
    private JoongAngController joongAngController;

    @Autowired
    private KyunghyangController kyunghyangController;

    // 1000ms => 1sec, 60000ms => 60sec => 1min,
    // 5분 간격 => 1000 * 60 * 5
    @Scheduled(fixedDelay = 1000 * 60 * 5)
     public void job() {
        chosunController.chosunPolitics();
        chosunController.chosunNational();
        chosunController.chosunInternational();
        chosunController.chosunCulture();
        chosunController.chosunOpinion();
        chosunController.chosunSport();
        chosunController.chosunEntertainments();

        dongAController.dongaPolitics();
        dongAController.dongaEconomy();
        dongAController.dongaNational();
        dongAController.dongaInternational();
        dongAController.dongaCulturelife();
        dongAController.dongaOpinion();
        dongAController.dongaSport();
        dongAController.dongaEntertainments();

        hankyorehController.hankyorehPolitics();
        hankyorehController.hankyorehEconomy();
        hankyorehController.hankyorehNational();
        hankyorehController.hankyorehInternational();
        hankyorehController.hankyorehCulture();
        hankyorehController.hankyorehOpinion();
        hankyorehController.hankyorehSport();

        joongAngController.joongangPolitics();
        joongAngController.joongangEconomy();
        joongAngController.joongangNational();
        joongAngController.joongangInternational();
        joongAngController.joongangOpinion();
        joongAngController.joongangSport();
        joongAngController.joongangEntertainments();
        joongAngController.joongangIt();

        // TODO: 2022/05/15 경향신문 rss 요청시 error 발생 (네트워크 문제인지 rss 요청 자체 문제인지 확인 필요
//        kyunghyangController.kyunghyangPolitics();
//        kyunghyangController.kyunghyangEconomy();
//        kyunghyangController.kyunghyangNational();
//        kyunghyangController.kyunghyangInternational();
//        kyunghyangController.kyunghyangCulture();
//        kyunghyangController.kyunghyangOpinion();
//        kyunghyangController.kyunghyangSport();
//        kyunghyangController.kyunghyangEntertainments();
//        kyunghyangController.kyunghyangIt();
    }
}
