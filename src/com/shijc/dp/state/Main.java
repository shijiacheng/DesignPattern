package com.shijc.dp.state;

public class Main {
    public static void main(String[] args){
        Work emergencyProjects = new Work();
        emergencyProjects.setHour(9);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(10);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(12);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(13);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(14);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(17);

        emergencyProjects.setFinish(false);

        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(19);
        emergencyProjects.WriteProgram();
        emergencyProjects.setHour(22);
        emergencyProjects.WriteProgram();
    }
}
