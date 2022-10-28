public class Main {
    public static void main(String[] args) {
        System.out.println("If");
        int numeroIf=1;
        if (numeroIf>0){
            System.out.println("Positivo");
        } else if (numeroIf<0) {
            System.out.println("Negativo");
        }
        else{
            System.out.println("es 0");
        }
        System.out.println("While");
        int numeroWhile=0;
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println("Numero: "+numeroWhile);
        }
        System.out.println("Do While");
        do {
            numeroWhile++;
            System.out.println("Numero: "+numeroWhile);
        }
        while (numeroWhile<3);
        System.out.println("For");
        for (int numeroFor=0; numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("Switch");
        String estacion="Primavera";
        switch (estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }
    }


}
