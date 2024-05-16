public class SwitchCase {
    public static void main(String[] args) {
        

        String sigla = "G";

        switch (sigla) {
            case "M" : {
                System.out.println("Médio");
                break;
            }
            case "G" : {
                System.out.println("Grande");
                break;
            }
            case "P" : {
                System.out.println("Pequeno");
                break;
            }
            default : 
            System.out.println("Indefinido");
        }


    }
}