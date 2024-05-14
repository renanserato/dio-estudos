public class SmartTv {
    
       boolean ligada = true;
       int canal = 1;
       int volume = 15; 
        
       public void mudarCanal (int novoCanal) {
        canal = novoCanal;
       }
       public void subirCanal () {
        canal++;
       } 
       
       public void diminuirCanal () {
        canal--;
       }
       
       
       public void aumentarVolume(){
            volume++;
        }
        public void diminuirVolume(){
            volume--;
        }

       public void ligar(){
        ligada=true;
       }
       public void desligar() {
        ligada=false;
       }
    
}



//Sistema Smart Tv usando Classe e Métodos.