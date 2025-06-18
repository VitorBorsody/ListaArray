//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> Lista = new ArrayList<>();
        Lista.add(3);
        Lista.add(5);
        Lista.add(7);
        Lista.add(9);
        for(int k:Lista){
            System.out.print(k + " ");


        }
        for(int i=0; i<Lista.size(); i++){
            if(Lista.get(i)==3){
                System.out.println("O índice do elemento 3, é: " + i);
            }
        }
    }
}
