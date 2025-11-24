import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {


            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    for (cumpleAgenda c : Constantes.CUMPLE_REPO.GetLista()) {
                        System.out.println(c.GetNombre());
                    }
                    break;

                case "2":
                    System.out.print("Día: ");
                    int dia = Integer.parseInt(sc.nextLine());
                    for (cumpleAgenda c : Constantes.CUMPLE_REPO.BuscarPorDia(dia)) {
                        System.out.println(c.GetNombre());
                    }
                    break;

                case "3":
                    System.out.print("Nombre: ");
                    cumpleAgenda c = Constantes.CUMPLE_REPO.BuscarPorNombre(sc.nextLine());
                    if (c != null) System.out.println(c.GetNombre());
                    break;

                case "4":
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Día: ");
                    int d = Integer.parseInt(sc.nextLine());
                    System.out.print("Mes: ");
                    int m = Integer.parseInt(sc.nextLine());
                    Constantes.CUMPLE_REPO.AddCumple(new cumpleAgenda(nombre, d, m));
                    break;

                case "5":
                    System.out.print("Eliminar nombre: ");
                    Constantes.CUMPLE_REPO.EliminarPorNombre(sc.nextLine());
                    break;

                case "6":
                    salir = true;
                    break;
            }
        }
    }
}
