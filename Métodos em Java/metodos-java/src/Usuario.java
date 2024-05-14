public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está ligada ? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Novo canal é: " + smartTv.canal);

        smartTv.ligar ();
        System.out.println("Novo Status -> A tv está ligada ? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status -> A tv está desligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> O volume é: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status -> O volume é: " + smartTv.volume);

        
    }
}
