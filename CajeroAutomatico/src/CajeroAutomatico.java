import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        var Saldo = 1000.0;
        int Opción;

                do{
                    System.out.println(" ¡Bienvenido al cajero automático! ");
                    System.out.println(" 1. Consular Saldo ");
                    System.out.println(" 2. Depositar Dinero ");
                    System.out.println(" 3. Retirar Dinero ");
                    System.out.println(" 4. Salir ");
                    System.out.println(" Selecciona una opción: ");

                    Opción= scanner.nextInt();
                    switch (Opción){
                        case 1-> {
                            System.out.println(" Su saldo actual es de: $ " + Saldo);
                        }

                        case 2-> {
                            System.out.println(" Ingrese la cantidad a depositar: ");
                            double Depósito = scanner.nextDouble();

                            if (Depósito <= 0) {
                                System.out.println(" La cantidad debe ser mayor a 0 ");
                                continue;
                            }
                            Saldo += Depósito;
                            System.out.println(" Depósito exitoso. Tu saldo es de: $ " + Saldo);
                        }

                        case 3-> {

                            System.out.println(" Ingrese la cantidad a retirar: ");
                            double Retiro = scanner.nextDouble();

                            if (Retiro <= 0){
                                System.out.println(" La cantidad debe ser mayor a 0 "); continue;
                            }

                            if (Retiro > Saldo){
                                System.out.println(" Saldo insuficiente. Tu saldo es de: $ " + Saldo);
                            } else {
                                Saldo-= Retiro;
                                System.out.println(" Retiro exitoso. Tu saldo es de: $ " + Saldo);
                            }
                        }

                        case 4-> {
                            System.out.println(" Operación Finalizada. ¡Vuelva Pronto! ");
                        }
                        default -> {
                            System.out.println(" Operación No Válida. Intente Nuevamente ");
                        }
                    }
                } while (Opción != 4);
                scanner.close();
    }
}