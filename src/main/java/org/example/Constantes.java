public class Constantes {
	public static void main(String[] args) {

        String opcion = sc.nextLine();
        switch (opcion) {
            case "1":
                for (cumpleAgenda c : repo.GetLista()) {
                    System.out.println(c.GetNombre());
                }
                break;

            case "2":
                System.out.print("Día: ");
                int dia = Integer.parseInt(sc.nextLine());
                for (cumpleAgenda c : repo.BuscarPorDia(dia)) {
                    System.out.println(c.GetNombre());
                }
                break;

            case "3":
                System.out.print("Nombre: ");
                cumpleAgenda c = repo.BuscarPorNombre(sc.nextLine());
                if (c != null) System.out.println(c.GetNombre());
                break;

            case "4":
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Día: ");
                int d = Integer.parseInt(sc.nextLine());
                System.out.print("Mes: ");
                int m = Integer.parseInt(sc.nextLine());
                repo.AddCumple(new cumpleAgenda(nombre, d, m));
                break;

            case "5":
                System.out.print("Eliminar nombre: ");
                repo.EliminarPorNombre(sc.nextLine());
                break;

            case "6":
                salir = true;
                break;

        }
    }
}
