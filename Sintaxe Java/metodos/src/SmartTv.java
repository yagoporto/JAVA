public class SmartTv {
    //definindo variáveis
    boolean ligada = false;
    int canal = 1, volume = 50;

    //Metodo para ligar
    public void ligar(){
        ligada = true;
    }
    //Metodo para desligar
    public void desligar(){
        ligada = false;
    }
    //Metodo para aumentar volume
    public void aumentarVolume(){
        volume++;
    }
    //Metodo para dimuir volume
    public void diminuirVolume(){
        volume--;
    }
    //Metodo para mudar canal para cima
    public void mudarCanalCima(){
        canal++;
    }
    //Metodo para mudar canal para baixo
    public void mudarCanalBaixo(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}