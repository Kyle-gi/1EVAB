package org.example;

import java.util.Scanner;

public class main {

    public static final String ELIMINAR = "Eliminar";
    public static final String MES = "Mes: ";
    public static final String DÍA = "Día: ";
    public static final String NOMBRE = "Nombre: ";

    public static void main(String[] args) {

        cumpleRepo repo = new cumpleRepo();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== AGENDA ===");
            System.out.println("1. Listar");
            System.out.println("2. Buscar por día");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Añadir");
            System.out.println("5. " + ELIMINAR);
            System.out.println("6. Salir");

            String opcion = sc.nextLine();

            switch (opcion) {
                Lista();
                for (cumpleAgenda c : repo.GetLista()) {
                        System.out.println(c.GetNombre());
                    }
                    break;

                CumpleDia();
                System.out.print(DÍA);
                    int dia = Integer.parseInt(sc.nextLine());
                    for (cumpleAgenda c : repo.BuscarPorDia(dia)) {
                        System.out.println(c.GetNombre());
                    }
                    break;

                BuscarNombre();
                System.out.print(NOMBRE);
                    cumpleAgenda c = repo.BuscarPorNombre(sc.nextLine());
                    if (c != null) System.out.println(c.GetNombre());
                    break;

                DiaMesNombre();
                System.out.print(NOMBRE);
                    String nombre = sc.nextLine();
                    System.out.print(DÍA);
                    int d = Integer.parseInt(sc.nextLine());
                    System.out.print(MES);
                    int m = Integer.parseInt(sc.nextLine());
                    repo.AddCumple(new cumpleAgenda(nombre, d, m));
                    break;

                EliminarNombre();
                System.out.print(ELIMINAR + " nombre: ");
                    repo.EliminarPorNombre(sc.nextLine());
                    break;

                salir();
                salir = true;
                    break;
            }
        }
    }

    private static void Lista() {
        case "1":
    }

    private static void CumpleDia() {
        case "2":
    }

    private static void BuscarNombre() {
        case "3":
    }

    private static void DiaMesNombre() {
        case "4":
    }

    private static void EliminarNombre() {
        case "5":
    }

    private static void salir() {
        case "6":
    }
}
