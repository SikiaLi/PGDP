class A {
    private int n;
    public A(int n) { this.n = n; }

    public int getN() { return n; }
    public void setN(int n) { this.n = n; }

    public static void main(String[] args) {
        A a1 = new A(2);
        A a2 = new A(3);
        a2.setN(2);
        A a3 = new A(3 - 1);
        A a4 = new A(2);
        A a5 = a1;

        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
        System.out.println(a1 == a4);
        System.out.println(a1 == a5);
    }

}
