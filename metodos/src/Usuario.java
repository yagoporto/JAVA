public class Usuario {
    public static void main(String[] args) throws Exception {
        //Criando o objeto na função main
        SmartTv smartTv = new SmartTv();

        //Estado inicial da tv
        System.out.println("TV: " +smartTv.ligada);
        System.out.println("CANAL: " + smartTv.canal);
        System.out.println("VOLUME: " +smartTv.volume);
        System.out.println();

        //Chamndo o "ligar" Metodos do objeto
        smartTv.ligar();
        //Novo estado da tv
        System.out.println("TV: " +smartTv.ligada);
        System.out.println("CANAL: " + smartTv.canal);
        System.out.println("VOLUME: " +smartTv.volume);
        System.out.println();

        //Chamando os metodos de volume e canal do objeto
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanalCima();
        smartTv.mudarCanalCima();
        smartTv.mudarCanalCima();
        //Novo estado da tv
        System.out.println("TV: " +smartTv.ligada);
        System.out.println("CANAL: " + smartTv.canal);
        System.out.println("VOLUME: " +smartTv.volume);
        System.out.println();

        //Chamando o metodo mudarCanal, onde o usuario escolhe o canal desejado
        smartTv.mudarCanal(13);
        //Novo estado da tv
        System.out.println("TV: " +smartTv.ligada);
        System.out.println("CANAL: " + smartTv.canal);
        System.out.println("VOLUME: " +smartTv.volume);
        System.out.println();
    }
    
}
