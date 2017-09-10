public class Exercise2 {

    //In the following program, explain why the value "6" is printed twice in a row:
    static class PrePostDemo {
        public static void main(String[] args){
            int i = 3;
            i++;
            System.out.println(i);    // "4"
            ++i;
            System.out.println(i);    // "5"
            System.out.println(++i);  // "6"
            /* In the above line, the increment is processed before the println
             * so the output of i is one greater than in the previous line at time of printing */
            System.out.println(i++);  // "6"
            /* In the above line, the println is evaluated before the increment is processed
             * So the value of i at time of output is still 6 at time of printing */
            System.out.println(i);    // "7"
        }
    }
}
