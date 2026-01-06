//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //here toDivide would be n
        int toDivide = 20;
        int oneCount = 0;

        while (toDivide != 0)
        {
            if (toDivide % 2 == 1)
            {
                oneCount++;
            }
            toDivide = toDivide / 2;
        }


        System.out.println(oneCount);
    }
}