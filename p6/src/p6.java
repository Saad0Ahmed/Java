class Access {
    int a = 10;
    int b = 20;
    int c = 30;
    int vol;
    void add() {
        vol = a * b * c;
        System.out.println("vol= " + vol);
    }
}

class p6 {
    public static void main(String[] args) throws Exception {
        Access obj = new Access();
        obj.add();
    }
}
