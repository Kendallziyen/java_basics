package week8_control_statements;

public class demo_for_loop {

    public static void main(String[] args) {

        //九九乘法
        for(int i = 1;i < 10;i++) {

            for(int j = 1;j < 10;j++) {
                System.out.println(i+"x"+j+"="+i*j);
            }
        }
    }
}
