public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println( "TV LIgada ? " + smartTV.ligada);
        System.out.println( "Canal Atual: " + smartTV.canal);
        System.out.println( "Volume Atual: " + smartTV.volume);
        
        smartTV.ligar();
        
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.abaixarVolume();
        
        smartTV.mudarCanal(13);
        
        System.out.println( "Novo Canal: " + smartTV.canal);
        System.out.println( "Novo Status -> TV LIgada ? " + smartTV.ligada);
        System.out.println( "Novo Status -> Volume Atual: " + smartTV.volume);
    }
}
