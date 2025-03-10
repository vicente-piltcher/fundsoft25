public class App {
    public static void main(String[] args) throws Exception {
        
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        esportivo.abastece(TipoCombustivel.GASOLINA, 30);
        esportivo.viaja(3);
        System.out.println(esportivo);

        Carro utilitario = new Carro("Utilitário", TipoCombustivel.DIESEL, 5, 70);
        utilitario.abastece(TipoCombustivel.DIESEL, 70);
        utilitario.viaja(12);
        System.out.println(utilitario);

        Carro suv = new Carro("SUV", TipoCombustivel.GASOLINA, 8, 55);
        suv.abastece(TipoCombustivel.GASOLINA, 40);
        suv.viaja(5);
        System.out.println(suv);

        Carro suvFlex = new Carro("SUVFlex", TipoCombustivel.FLEX, 8, 6, 55);
        suvFlex.abastece(TipoCombustivel.GASOLINA, 40);
        suvFlex.viaja(7);
        System.out.println(suvFlex);



    }
}
