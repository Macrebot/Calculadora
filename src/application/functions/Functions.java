package application.functions;

public class Functions {
    public double Suma(double a, double b){
        return a + b;
    }

    public double Resta(double a, double b){
        return a - b;
    }

    public double Multiplicacion(double a, double b){
        return a * b;
    }

    public double Division (double a, double b){
        return a / b;
    }

    public double Igual (double a, double b, char caracter){
        switch(caracter){
            case '+':
                return Suma(a, b);

            case '-':
                return Resta(a,b);

            case '*':
                return Multiplicacion(a, b);

            case '/':
                return Division(a, b);

            default:
                return 0;
        }
    }
}
