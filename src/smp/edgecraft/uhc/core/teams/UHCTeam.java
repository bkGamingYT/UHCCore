package smp.edgecraft.uhc.core.teams;

import java.util.ArrayList;
import java.util.List;

public enum UHCTeam
{
    UNSET,
    BLUE,
    RED,
    YELLOW,
    GREEN,
    PINK;

    private List<UHCPlayer> players;

    UHCTeam() {
        this.players = new ArrayList<>();
    }

    public List<UHCPlayer> getPlayers() {
        return this.players;
    }

    public void setPlayers(List<UHCPlayer> players) {
        this.players = players;
    }

    public boolean isActive() {
        return this.players.size() > 0;
    }
}
