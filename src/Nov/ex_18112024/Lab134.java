package Nov.ex_18112024;

public class Lab134 {
    public static void main(String[] args) {
        Lab134_Bank sbi = new Lab134_Bank("INR",100);
        Lab134_Bank icici = new Lab134_Bank("INR",123);
        System.out.println(sbi.add(icici));

        Lab134_Bank jp_chase = new Lab134_Bank("USD",100);
        // 100 + 100*85 = 8600
        System.out.println(sbi.add(jp_chase));

    }
}
