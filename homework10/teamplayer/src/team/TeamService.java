package team;

import model.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamService {
    Scanner sc = new Scanner(System.in);

    public ArrayList<Player> getAllPlayers() {
        ArrayList<Player> allPlayers = new ArrayList<>();
        allPlayers.add(new Player(1, "nguyễn văn toàn", Position.GK));
        allPlayers.add(new Player(2, "nguyễn văn toàn", Position.GK));
        allPlayers.add(new Player(3, "nguyễn văn toàn", Position.DF));
        allPlayers.add(new Player(4, "nguyễn văn toàn", Position.DF));
        allPlayers.add(new Player(5, "nguyễn văn toàn", Position.DF));
        allPlayers.add(new Player(6, "nguyễn văn toàn", Position.DF));
        allPlayers.add(new Player(7, "nguyễn văn toàn", Position.DF));
        allPlayers.add(new Player(8, "nguyễn văn toàn", Position.DF));
        allPlayers.add(new Player(9, "nguyễn văn toàn", Position.DF));
        allPlayers.add(new Player(10, "nguyễn văn toàn", Position.MF));
        allPlayers.add(new Player(11, "nguyễn văn toàn", Position.MF));
        allPlayers.add(new Player(12, "nguyễn văn toàn", Position.MF));
        allPlayers.add(new Player(13, "nguyễn văn toàn", Position.MF));
        allPlayers.add(new Player(14, "nguyễn văn toàn", Position.MF));
        allPlayers.add(new Player(15, "nguyễn văn toàn", Position.MF));
        allPlayers.add(new Player(16, "nguyễn văn toàn", Position.MF));
        allPlayers.add(new Player(17, "nguyễn văn toàn", Position.FW));
        allPlayers.add(new Player(18, "nguyễn văn toàn", Position.FW));
        allPlayers.add(new Player(19, "nguyễn văn toàn", Position.FW));
        allPlayers.add(new Player(20, "nguyễn văn toàn", Position.FW));

        return allPlayers;
    }

    public Player getNewPlayer(ArrayList<Player> list) {
        Player nPlayer = new Player();
        boolean flag = true;
        int check = 0;
        do {
            System.out.println("Type ID:");
            int typeID = 3;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getNumber() == typeID) {
                    System.out.println("Please type again!");
                    check++;
                }
            }
            if (check==0){
                flag = false;
            }
        }while (!flag);
        System.out.println("Type name: ");
        nPlayer.setFullName(sc.nextLine());
//        System.out.println("Type Position: ");
//        nPlayer.setPosition(sc.);

        return nPlayer;
    }


}
