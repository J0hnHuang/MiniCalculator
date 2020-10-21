import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int op;
    System.out.println("What type of operation do you wish to perform?");
    System.out.println("\t1. add");
    System.out.println("\t2. subtract");
    System.out.println("\t3. multiply");
    System.out.println("\t4. divide");
    System.out.println("\t0. exit");

    op = scan.nextInt();
    System.out.println("What is the first value?");
    double x = scan.nextDouble();
    System.out.println("What is the second value?");
    double y = scan.nextDouble();

    if(op==1){
      add(x,y);
    }else if(op == 2){
      subtract(x,y);
    }else if (op == 3){
      multiply(x,y);
    }else if (op == 4){
      divide(x,y);
    }else if(op == 0){
      System.exit(0);
    }else{
      System.out.println("Not a valid option");
    }
    
  }

  public static void add(double x, double y){
    System.out.println(x+y);
  }
  public static void subtract(double x, double y){
    System.out.println(x-y);
  }
  public static void multiply(double x, double y){
    System.out.println(x*y);
  }
  public static void divide(double x, double y){
    System.out.println(x/y);
  }
  
}