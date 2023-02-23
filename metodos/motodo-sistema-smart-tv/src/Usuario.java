public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
       // Aumentando e diminuindo volume por comandos.
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("volume atual: " + smartTv.volume);
        
        // Aumentando, diminuindo e mudando de canais por comandos.
        
        smartTv.aumentarCanal();
        smartTv.mudarCanal(32);

        


        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);


        smartTv.desligar();
        System.out.println("TV Desgada? " + smartTv.ligada);
    
    
    
    
    
    }
}
