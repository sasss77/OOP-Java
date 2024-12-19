public class TaskOne {
    public static void main(String[] args) {
        int oopMarking;
        int databaseMarking;
        int architectureMarking;
        int creativeThinkingMarking;
        float avg;
        
        oopMarking = 85;
        databaseMarking = 90;
        architectureMarking = 75;
        creativeThinkingMarking = 95;
        
        avg = (oopMarking + databaseMarking + architectureMarking + creativeThinkingMarking) / 4;
        boolean check1 = (avg >= 40); 
        boolean check2 =(avg >= 50);
        String result = (check1 && check2) ? "Good Job !" : "Bad Job";
        System.out.println(result);


        
        
        




    }
    }