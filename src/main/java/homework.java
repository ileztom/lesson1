public class homework {
    public static void main(String[] args){
        System.out.println(ex1(20,40));
        ex2(5);
        System.out.println(ex3(3));
        ex4();
        ex5(2021);
    }


    public static boolean ex1(int a,int b){
        int sum = a + b;
        if(sum >= 50){
            return true;
        }
        else{
            return false;
        }
    }

    public static void ex2(int a){
        if(a >= 0){
            System.out.println("положительное");
        }
        else{
            System.out.println("отрицательное");
        }
    }

    public static boolean ex3(int a){
        if (a >= 0){
            return true;
        }
        return false;
    }

    public static void ex4(){
        for (int a = 0; a < 5; a++){
            for(int b = 0; b < 5; b++){
                System.out.println("_");
            }
            System.out.println();
        }
    }
    public static void ex5(int a){
        if (a / 4 == 0){
            System.out.println("год високосный");
        }
        else
            System.out.println("год не високосный");
    }
}
