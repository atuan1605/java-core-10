import model.Player;
import team.TeamService;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        TeamService service = new TeamService();
        ArrayList<Player> list = new ArrayList<>();

        list = service.getAllPlayers();
        for (Player p : list){
            System.out.println(p);
        }
        service.getNewPlayer(list);
    }
}
