import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Opciones;

        do {
            System.out.println("-> MENU DE OPCIONES <-");
            System.out.println("1. -> Calcular IMC");
            System.out.println("2. -> Calcular área de un rectángulo");
            System.out.println("3. -> Convertir °C a °F");
            System.out.println("4. -> Calcular área de un circulo");
            System.out.println("5. -> SALIR");
            System.out.print(" -> SELECCIONA UNA OPCION -> : ");


            Opciones = scanner.nextInt();

            switch (Opciones) {
                case 1:
                    System.out.print("Ingresa el peso (kg) 00 : ");
                    double peso = scanner.nextDouble();
                    System.out.print("Ingresa la altura (m) 0.0 : ");
                    double altura = scanner.nextDouble();
                    System.out.println("El IMC es: " + calcularIMC(peso, altura));
                    break;
                case 2:
                    System.out.print("Ingresa la base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingresa la altura: ");
                    double altRect = scanner.nextDouble();
                    System.out.println("El área del rectángulo es: " + calcularAreaRectangulo(base, altRect));
                    break;
                case 3:
                    System.out.print("Ingresa los grados Celsius: ");
                    double celsius = scanner.nextDouble();
                    System.out.println("El resultado en Fahrenheit es: " + convertirCelsiusAFahrenheit(celsius));
                    break;
                case 4:
                    System.out.print("Ingresa el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    System.out.println("El área del círculo es: " + calcularAreaCirculo(radio));
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
            System.out.println();

        } while (Opciones != 5);

        scanner.close();
    }

    /**
     * IMC PesoKG(Altura+Altura)
     * * @param Peso en kg
     * @param altura en metros
     * @return IMC calculado.
     */
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    /**
     * área de un rectángulo multiplicando su base por su altura.
     * * @param base longitud de la base del rectángulo.
     * @param altura longitud de la altura del rectángulo.
     * @return área total del rectángulo.
     */
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    /**
     * temperatura de grados Celsius a grados Fahrenheit.
     * * @param celsius temperatura en grados Celsius.
     * @return temperatura equivalente en grados Fahrenheit.
     */
    public static double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    /**
     * Calcula el area de un circulo utilizando la constante PI.
     * * @param radio El radio del circulo.
     * @return area total del circulo.
     */
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}