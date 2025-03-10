public class App {
    public static void main(String[] args) throws Exception {
        
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        esportivo.abastece(TipoCombustivel.GASOLINA, 30);
        esportivo.viaja(3);
        System.out.println(esportivo);



    }
}
