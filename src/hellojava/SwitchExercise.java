package hellojava;

public class SwitchExercise {
    public static void main(String[] args) {
        int number = 134354;
        switch(number % 7){
        case 1:
        	System.out.println("one");
        	break;
        case 3:
        	System.out.println("three");
        	break;
        }
        char[] sequence = "abc".toCharArray();
        for (int i = 0;i < sequence.length; i++){
        	System.out.println(sequence[i]);
        }
    }
}


