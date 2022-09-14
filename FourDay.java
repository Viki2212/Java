public class FourDay {
    public void calling(String name){
        System.out.println("Calling to " + name);
    }
    public void calling(int number){
        System.out.println("Calling to " + number);
    }
    public int calling(int a, int b){
        int num3 = a + b;
        return num3;
    }
    int c;
    void fourth(int a, int b){
        int c = 10;
        System.out.println(a+b+this.c);
    }
    public static void main(String[] args){
        FourDay obj = new FourDay();
        obj.fourth(10, 10 );

        

    }
}


