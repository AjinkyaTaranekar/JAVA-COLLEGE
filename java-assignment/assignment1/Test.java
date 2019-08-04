import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int score[]=new int[5];
        
        for(int i=0;i<5;i++){
            score[i]=scan.nextInt();
            if(validity(score[i])){
                System.out.println("Invalid test score");
                i--;
            }
        }
        System.out.println("Average score is-"+ averageScore(totalScore(score)));
        System.out.println("Highest score is- "+maxScore(score));
    scan.close();
    }
    
    private static float averageScore(int total) {
		return (total/5);
    }
    private static int totalScore(int score[]) {
    	int total=0;
        for(int i=0;i<5;i++){
            total=total+score[i];
        }
    	return (total);
    }
    private static boolean validity(int score) {
    	if(score>=100||score<=0)
    		return true;
    	return false;
    }
    private static int maxScore(int score[]) {
    	int max=0;
        for (int i = 1; i < score.length; i++){
            if (score[i] > max) {
                max = score[i];
            }
        }
        return max;
        
    }
}
