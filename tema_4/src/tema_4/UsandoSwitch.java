package tema_4;

public class UsandoSwitch {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		String estacion ="VERANO";
		switch (estacion) {
		case "VERANO":
			System.out.println("es verano");
			break;
		case "OTOÑO":
			System.out.println("es OTOÑO");
			break;
		case "INVIERNO":
			System.out.println("es INVIERNO");
			break;
		case "PRIMAVERA":
			System.out.println("es PRIMAVERA");
			break;

		default:
			System.out.println("NO ES UNA ESTACION ");
			break;
		}
	}

}
