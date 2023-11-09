package geasta05.springcoredemo.common;

import geasta05.springcoredemo.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @PostConstruct
    public void doMyStartup() {
        System.out.println("In doMyStartup(): " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanup() {
        System.out.println("In doMyCleanup(): " + getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
