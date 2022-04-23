import java.util.ArrayList;
import java.util.Random;

public class Team {
    public ArrayList<Player> getAllPlayer() {
        ArrayList<Player> allPlayers = new ArrayList<>();
        allPlayers.add(new Player(1, "Nguyễn văn toàn", Position.GK));
        allPlayers.add(new Player(1, "Nguyễn văn toàn", Position.GK));
        allPlayers.add(new Player(2, "Nguyễn văn toàn", Position.GK));
        allPlayers.add(new Player(3, "Nguyễn văn toàn", Position.DF));
        allPlayers.add(new Player(4, "Nguyễn văn toàn", Position.DF));
        allPlayers.add(new Player(5, "Nguyễn văn toàn", Position.DF));
        allPlayers.add(new Player(6, "Nguyễn văn toàn", Position.DF));
        allPlayers.add(new Player(7, "Nguyễn văn toàn", Position.DF));
        allPlayers.add(new Player(8, "Nguyễn văn toàn", Position.DF));
        allPlayers.add(new Player(9, "Nguyễn văn toàn", Position.DF));
        allPlayers.add(new Player(10, "Nguyễn văn toàn", Position.MF));
        allPlayers.add(new Player(11, "Nguyễn văn toàn", Position.MF));
        allPlayers.add(new Player(12, "Nguyễn văn toàn", Position.MF));
        allPlayers.add(new Player(13, "Nguyễn văn toàn", Position.MF));
        allPlayers.add(new Player(14, "Nguyễn văn toàn", Position.MF));
        allPlayers.add(new Player(15, "Nguyễn văn toàn", Position.MF));
        allPlayers.add(new Player(16, "Nguyễn văn toàn", Position.FW));
        allPlayers.add(new Player(17, "Nguyễn văn toàn", Position.FW));
        allPlayers.add(new Player(18, "Nguyễn văn toàn", Position.FW));
        allPlayers.add(new Player(19, "Nguyễn văn toàn", Position.FW));
        allPlayers.add(new Player(20, "Nguyễn văn toàn", Position.FW));


        return allPlayers;
    }

    public void show(ArrayList<Player> list) {
        for (Player p : list) {
            System.out.println(p.getNumber() + " - " + p.getFullName() + " - " + p.getPosition());
        }
    }

    public ArrayList<Player> builtTeam(ArrayList<Player> allPlayers, int df, int mf, int fw){
        ArrayList<Player> choiceTeam = new ArrayList<>();
        Random rd = new Random();
        int gkSize = 0;
        int dfSize = 0;

        while(gkSize < 1){
            int rdGoalKeeper = rd.nextInt(20);
            if (allPlayers.get(rdGoalKeeper).getPosition()==Position.GK){
                choiceTeam.add(allPlayers.get(rdGoalKeeper));
                gkSize++;
            }
        }
        while (dfSize<df){
            int dfRandom = rd.nextInt();
            if (allPlayers.get(dfRandom).getPosition()==Position.DF){
                if (!choiceTeam.contains(allPlayers.get(dfRandom))){
                    choiceTeam.add(allPlayers.get(dfRandom));
                    dfSize++;
                }

            }
        }
        return choiceTeam;
    }


}

