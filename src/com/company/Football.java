package com.company;

public class Football extends Sports{
    private final int NUMBER_OF_TEAM_MEMBERS = 11;
    @Override
    String getName() {
        return "football";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has " + NUMBER_OF_TEAM_MEMBERS + " players in " + getName() + ".");
    }
}
