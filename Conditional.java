public class Conditional {
  public static void main(String[] args) {
    /*
     * syntax if statements
     * 
     * if(boolean expression T or F){
     * // body
     * }else{
     * // do this
     * }
     */

    int salary = 25400;
    // if (salary > 10000) {
    //   salary = salary + 2000;
    // } else {
    //   salary = salary + 1000;
    // }

    /*
     multiple if-else
     */

     if (salary>20000){
     salary+=3000;
     }else if (salary>10000) {
      salary += 2000;
     }else{
      salary+=1000;
     }

    System.out.println(salary);
  }
}
