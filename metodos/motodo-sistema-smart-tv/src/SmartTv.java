public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
   
    //Aumentar, diminuir e mudar de canal.
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando canal para: " + canal);
    }

    public void duminuirCanal(){
        canal--;
        System.out.println("Diminuindo canal para: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando o canal para o canal: " + novoCanal);
    }

    //Aumentar e diminuir o Volume.
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    //ligar e desligar smartTv
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    
}
