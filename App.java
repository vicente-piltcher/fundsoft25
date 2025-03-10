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

        Carro suvFlex = new Carro("SUVFlex", TipoCombustivel.FLEX, 8, 6, 65);
        suvFlex.abastece(TipoCombustivel.GASOLINA, 40);
        suvFlex.viaja(7);
        System.out.println(suvFlex);


        Carro econo = new Carro("Economico", TipoCombustivel.GASOLINA, 20, 55);


        for (int i = 0; i < 5; ++i){
            System.out.println("\n\n----------------");

            System.out.println("\nAbastencendo carro basico com gasolina(55):");
            econo.abastece(TipoCombustivel.GASOLINA, 55);
            System.out.println(econo);

            System.out.println("\nViajando com o carro Econo(1.100Km):");
            econo.viaja(1100);
            System.out.println(econo);
        }

        System.out.println("\n\n----------------");

        System.out.println("\nAbastencendo carro basico com gasolina(55):");
        econo.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(econo);

        System.out.println("\nViajando com o carro Econo(Com mais de 5000Km)(70):");
        econo.viaja(70);
        System.out.println(econo);




    }
}
