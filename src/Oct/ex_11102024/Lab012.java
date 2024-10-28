package Oct.ex_11102024;

public class Lab012 {
    public static void main(String[] args) {
        //1. Arithmentic operators-->>+,-,*,/,%
        int a=20, b=10;
        System.out.println("1. Arithmentic operators");
        System.out.println("Add = " +(a+b));
        System.out.println("sub = " +(a-b));
        System.out.println("Mul = " +(a*b));
        System.out.println("Div = " +(a/b));
        System.out.println("Modulo div = " +(a%b));

        System.out.println("--------------------");

        //2. Unary operators -->>Increment, decrement, logical not operators
        System.out.println("2.Unary operators");
        int c=10;
        boolean d = true;
        System.out.println("Pre Inc = " +(++c));
        System.out.println("Post Inc = " +(c++));
        System.out.println("Pre Dec = " +(--c));
        System.out.println("Post Dec  = " +(c--));
        System.out.println("Logical not = " +(!d));

        System.out.println("--------------------");

        //3. Assignment Operator-->>=
        System.out.println("3. Assignment operators");
        System.out.println("Add = " +(a+=2));
        System.out.println("sub = " +(a-=2));
        System.out.println("Mul = " +(a*=2));
        System.out.println("Div = " +(a/=2));
        System.out.println("Modulo div = " +(a%=2));
        System.out.println("Left_shift = " +(a <<= 2));
        System.out.println("Right_shift = " +(a >>= 2));

        System.out.println("--------------------");

        //4. Relational operators--<,>,<=,>=,==,!=
        System.out.println("4. Relational operators");
        System.out.println("lessthan = " +(a<b));
        System.out.println("Greaterthan = " +(a>b));
        System.out.println("lessthanequalto = " +(a<=b));
        System.out.println("Greaterthanequalto = " +(a>=b));
        System.out.println("equalto = " +(a==b));
        System.out.println("Notequalto = " +(a!=b));

        System.out.println("--------------------");

        //5. Logical operators-->>AND,OR,NOT-->&&,||,!
        System.out.println("5.Logical operators");
        boolean x = true, y = false;
        System.out.println("logicalAND = " +( x && y));
        System.out.println("logicalOR = " +(x || y));
        System.out.println("logicalNOT = " +(!y));

        System.out.println("--------------------");

        //6. Ternary Operator-->>?:
        int result;
        result = ((a>b)? a : b);// result = condition ? expression1 : expression2;
        System.out.println("Ternary_result = " +result);

        System.out.println("--------------------");



    }
}
