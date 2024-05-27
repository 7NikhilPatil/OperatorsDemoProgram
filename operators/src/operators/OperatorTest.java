package operators;

public class OperatorTest {

	public static void main(String[] args) {
		
		// Arithmetic Operators
		System.out.println("-----Arithmetic Operators-----");
		
		int num1 = 20;
		int num2 = 40;
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;
		
		System.out.println("Addition of num1=20 and num2=40: " + sum);
		System.out.println("Substraction of num1=20 and num2=40: " + sub);
		System.out.println("Multiplication of num1=20 and num2=40: " + mul);
		System.out.println("Division of num1=20 and num2=40: " + div);
		System.out.println("Mod of num1=20 and num2=40: " + mod);
		System.out.println();
		

		// Relational Operators
		System.out.println("-----Relational Operators-----");
		
		int a = 100;
		int b = 350;
		
		System.out.println(a + " is less than " + b + ": " + (a < b));
		System.out.println(a + " is greater than " + b + ": " + (a > b));
		System.out.println(a + " is less than or equal to " + b + ": " + (a <= b));
		System.out.println(a + " is greater than or equal to " + b + ": " + (a >= b));
		System.out.println(a + " is equal equal to " + b + ": " + (a == b));
		System.out.println(a + " is not equal to " + b + ": " + (a != b));
		System.out.println();
		
		
		// Logical Operators
		System.out.println("-----Logical Operators-----");
		
		int x = 123;
		int y = 656;
		
		System.out.println(x + " is less than " + y + " && " + x + " is greater than " + y + ": " + (x < y && x > y));
		System.out.println(x + " > " + y + " || " + x + " < " + y + ": " + (x > y || x < y));
		System.out.println(!(x > y));
		System.out.println();
		
		
		// Assignment Operators
		System.out.println("-----Assignment Operators-----");
		
		
        int res = 10, num = 20;
        
        int var = 10;
        System.out.println("var= " + var);
        System.out.println();
        
        System.out.println("res = " + res);
        System.out.println("num = " + num);
 
        res += num;
        System.out.println("res += n2:- " + res);
        System.out.println();
        
        System.out.println("res = " + res);
        System.out.println("num = " + num);
        
        res -= num;
        System.out.println("res -= n2:- " + res);
        System.out.println();
        
        System.out.println("res = " + res);
        System.out.println("num = " + num);
 
        res *= num;
        System.out.println("res *= n2:- " + res);
        System.out.println();
        
        System.out.println("res = " + res);
        System.out.println("num = " + num);
 
        res /= num;
        System.out.println("res /= n2:- " + res);
        System.out.println();
        
        
     // Ternary Operators
     	System.out.println("-----Ternary Operators-----");
     	
     	int p=10, q=20;
     	
     	res = (p > q) ? p : q;
     	System.out.println("Result= " + res);
     	System.out.println();  	
     	
	}

}
