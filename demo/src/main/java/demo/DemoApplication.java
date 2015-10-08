package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private TeamRepository teamRepository;

    @PostConstruct
    public void init() {
        List<Team> list = new ArrayList<>();

        Team team = new Team();
        team.setLocation("Harlem");
        team.setName("Globetrotters");
        team.setPlayers(new HashSet<>());

        team.getPlayers().add(new Player("Bob", "1st base"));
        team.getPlayers().add(new Player("Shirley", "2nd base"));

        list.add(team);

        team = new Team();
        team.setLocation("Washington");
        team.setName("Generals");
        team.setPlayers(new HashSet<>());

        team.getPlayers().add(new Player("Dave", "3rd base"));
        team.getPlayers().add(new Player("Blockhead", "4th base"));

        list.add(team);

        teamRepository.save(list);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
