class SecondDay {
    public static void main(String[] args) {

        ThirdDay trday = new ThirdDay();
        String print = trday.CarModel();
        System.out.println(print);

        trday.CarPrice();

        boolean cont = trday.CarCondition();
        System.out.println(cont);

        trday.OrgPrice();

        FourDay frdy = new FourDay();
        long num = frdy.calling(10, 20);
        System.out.println(num);

        frdy.calling(9629017);
        frdy.calling("Bro");

    }
}
