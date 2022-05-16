package service;

import model.Position;
import model.Team;

import java.util.ArrayList;
import java.util.Random;

public class TeamService {

    public ArrayList<Team> getAllPlayers(){
        ArrayList<Team> allPlayers = new ArrayList<>();
        allPlayers.add(new Team(1, "Nguyễn Văn Toản", Position.GK));
        allPlayers.add(new Team(2, "Nguyễn Văn Toản", Position.GK));
        allPlayers.add(new Team(3, "Nguyễn Văn Toản", Position.DF));
        allPlayers.add(new Team(4, "Nguyễn Văn Toản", Position.DF));
        allPlayers.add(new Team(5, "Nguyễn Văn Toản", Position.DF));
        allPlayers.add(new Team(6, "Nguyễn Văn Toản", Position.DF));
        allPlayers.add(new Team(7, "Nguyễn Văn Toản", Position.DF));
        allPlayers.add(new Team(8, "Nguyễn Văn Toản", Position.DF));
        allPlayers.add(new Team(9, "Nguyễn Văn Toản", Position.DF));
        allPlayers.add(new Team(10, "Nguyễn Văn Toản", Position.MF));
        allPlayers.add(new Team(11, "Nguyễn Văn Toản", Position.MF));
        allPlayers.add(new Team(12, "Nguyễn Văn Toản", Position.MF));
        allPlayers.add(new Team(13, "Nguyễn Văn Toản", Position.MF));
        allPlayers.add(new Team(14, "Nguyễn Văn Toản", Position.MF));
        allPlayers.add(new Team(15, "Nguyễn Văn Toản", Position.MF));
        allPlayers.add(new Team(16, "Nguyễn Văn Toản", Position.MF));
        allPlayers.add(new Team(17, "Nguyễn Văn Toản", Position.FW));
        allPlayers.add(new Team(18, "Nguyễn Văn Toản", Position.FW));
        allPlayers.add(new Team(19, "Nguyễn Văn Toản", Position.FW));
        allPlayers.add(new Team(20, "Nguyễn Văn Toản", Position.FW));
        return allPlayers;
    }

    public void showAllPlayers(ArrayList<Team> list){
        list.forEach(System.out::println);
    }

    public ArrayList<Team> buildTeam(ArrayList<Team> list, int df, int mf, int fw){
        Random rd = new Random();
        ArrayList<Team> teamArrayList = new ArrayList<>();
        int gkSize = 0;
        int dfSize = 0;
        int mfSize = 0;
        int fwSize = 0;
        while (gkSize < 1){
            int rdGK = rd.nextInt(20);
            if (list.get(rdGK).getPosition()==Position.GK){
                teamArrayList.add(list.get(rdGK));
                gkSize++;
            }
        }
        while (dfSize<df){
            int rdDF = rd.nextInt(20);
            if (list.get(rdDF).getPosition()==Position.DF){
                if (!teamArrayList.contains(list.get(rdDF))){
                    teamArrayList.add(list.get(rdDF));
                    dfSize++;
                }
            }
        }
        while (mfSize<mf){
            int rdMF = rd.nextInt(20);
            if (list.get(rdMF).getPosition()==Position.MF){
                if (!teamArrayList.contains(list.get(rdMF))){
                    teamArrayList.add(list.get(rdMF));
                    mfSize++;
                }
            }
        }
        while (fwSize<mf){
            int rdFW = rd.nextInt(20);
            if (list.get(rdFW).getPosition()==Position.FW){
                if (!teamArrayList.contains(list.get(fwSize))){
                    teamArrayList.add(list.get(rdFW));
                    fwSize++;
                }
            }
        }

        return teamArrayList;
    }
}
