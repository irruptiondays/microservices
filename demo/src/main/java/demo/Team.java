package demo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by TValentine on 10/6/15.
 */
@Entity
class Team {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String field;
    private String location;
    private String mascotte;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    private Set<Player> players = new HashSet<>(0);

    public Team() {
        //default
    }

    public Team(String name, String location, Set<Player> players) {
        this.name = name;
        this.location = location;
        this.players = players;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascotte() {
        return mascotte;
    }

    public void setMascotte(String mascotte) {
        this.mascotte = mascotte;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
