public class App {
    public static void main(String[] args) throws Exception {
        
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        esportivo.abastece(TipoCombustivel.GASOLINA, 30);
        esportivo.viaja(3);
        System.out.println(esportivo);

        Carro utilitario = new Carro("Utilitário", TipoCombustivel.DIESEL, 5, 70);
        utilitario.abastece(TipoCombustivel.GASOLINA, 70);
        utilitario.viaja(12);
        System.out.println(utilitario);



    }
}
