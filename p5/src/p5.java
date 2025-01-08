class Access {
    int a = 10;
    int b = 20;
    int c = 30;
    int sum = a + b + c;
    int avg = sum / 3;
    void add() {
        System.out.println("sum= " + sum);
        System.out.println("avg= " + avg);
    }
}

class p5 {
    public static void main(String[] args) throws Exception {
        Access obj = new Access();
        obj.add();
    }
}
