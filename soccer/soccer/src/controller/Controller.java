package controller;

import model.Team;
import service.TeamService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void admin(){
        TeamService service = new TeamService();
        ArrayList<Team> list = service.getAllPlayers();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            mainMenu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    service.showAllPlayers(service.buildTeam(list,4,4,2));
                    break;
                case 2:
                    service.showAllPlayers(service.buildTeam(list,4,3,3));
                    break;
                case 3:
                    service.showAllPlayers(service.buildTeam(list,3,5,2));
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Please reselect");
                    break;
            }
        }
    }

    public static void mainMenu(){
        System.out.println("====CHOOSE YOUR TEAM====");
        System.out.println("1. 1GK - 4DF - 4MF - 2FW");
        System.out.println("2. 1GK - 4DF - 3MF - 3FW");
        System.out.println("3. 1GK - 3DF - 5MF - 2FW");
        System.out.println("0. Exit!");
        System.out.println("Select [0-3]");
}
}
