import java.util.Scanner;

public class Player {
    private
		double average;
    	String name,team,firstName,lastName;
    	Scanner scan=new Scanner(System.in);
       
    	private double getAverage() {
			return average;
		}
    	private void setAverage(double average) {
			this.average = average;
		}
    	private String getName() {
			return name;
		}
    	private void setName(String name) {
			this.name = name;
		}
    	private String getTeam() {
			return team;
		}
    	private void setTeam(String team) {
			this.team = team;
		}
	public Player(){
		System.out.print("Enter player's first name- ");
        firstName=scan.next();
        System.out.print("Enter player's last name- ");
        lastName=scan.next();
        name=firstName + " " + lastName;
        setName(name);
        
        System.out.print("Enter player's avg score- ");
        average=scan.nextDouble();
        setAverage(average);
        
        System.out.print("Enter player's team- ");
        team=scan.next();
        setTeam(team);
       
    }
    public void updateName(){
    	System.out.print("Enter player's first name- ");
        firstName=scan.next();
        System.out.print("Enter player's last name- ");
        lastName=scan.next();
        name=firstName + " " + lastName;
        setName(name);
        
        System.out.println("Player's name-"+ getName());
    }
    public void updateAverage(){
        System.out.print("Enter player's avg score- ");
        average=scan.nextDouble();
        setAverage(average);
        
        System.out.println("Player's average- "+getAverage());
    }
    public void updateTeam(){
        System.out.print("Enter player's team- ");
        team=scan.next();
        setTeam(team);
        
        System.out.println("Player's team name- "+getTeam());
    }
    public static void main(String args[]){
        Player player1=new Player();
        
        System.out.println("\n-----------------------\n");
        System.out.println("Update Player's Name-\n "); 
        player1.updateName();
        
        System.out.println("\n-----------------------\n");
        System.out.println("Update Player's Average Score-\n "); 
        player1.updateAverage();
        
        System.out.println("\n-----------------------\n");
        System.out.println("Update Player's Team-\n "); 
        player1.updateTeam();
        
        System.out.println("-----------------------");
        player1.scan.close();
    }
    
}