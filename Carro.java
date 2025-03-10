public class Carro {

    private String modelo;
    private Motor motor;
    private TanqueCombustivel tanque;

    public Carro(String modelo, TipoCombustivel tipoCombustivel, int consumoMotor, int capacidadeTanque) {
        this.modelo = modelo;
        motor = new Motor(tipoCombustivel, consumoMotor);
        tanque = new TanqueCombustivel(tipoCombustivel, capacidadeTanque);
    }

    public Carro(String modelo, TipoCombustivel tipoCombustivel, int consumoComb1, int consumoComb2, int capacidadeTanque) {
        this.modelo = modelo;
        motor = new Motor(tipoCombustivel, consumoComb1, consumoComb2);
        tanque = new TanqueCombustivel(tipoCombustivel, capacidadeTanque);
    }

    public String getModelo() {
        return modelo;
    }

    public int getCombustivelDisponivel() {
        return tanque.getCombustivelDisponivel();
    }

    // Retorna a quantidade efetivamente abastecida
    public int abastece(TipoCombustivel tipoCombustivel, int quantidade) {
        int capacidadeLivre = tanque.getCapacidade() - tanque.getCombustivelDisponivel();

        if(this.tanque.getTipoCombustivel() == TipoCombustivel.FLEX) {

            if(this.motor.alreadyDecided == false) {
                if (tipoCombustivel == TipoCombustivel.GASOLINA){
                    this.motor.defineConsume(1);
                }
    
                if (tipoCombustivel == TipoCombustivel.ALCOOL){
                    this.motor.defineConsume(2);
                }
            }

        }

        if (capacidadeLivre < quantidade) {
            tanque.abastece(tipoCombustivel, capacidadeLivre);
            return capacidadeLivre;
        } else {
            tanque.abastece(tipoCombustivel, quantidade);
            return quantidade;
        }
    }

    // Retorna a distancia que consegue viajar com o combustivel remanescente
    public int verificaSePodeViajar(int distancia) {
        int combustivelNecessario = motor.combustivelNecessario(distancia);
        if (tanque.getCombustivelDisponivel() >= combustivelNecessario) {
            return distancia;
        } else {
            return tanque.getCombustivelDisponivel() * motor.getConsumo();
        }
    }

    // Retorna true se conseguiu viajar
    public boolean viaja(int distancia) {

        if (this.motor.quilometragemCalculada >= 5000){
            if(this.motor.getConsumo() >= 10) {
                this.motor.setConsumo(this.motor.getConsumo() - 1);
            }
            this.motor.quilometragemCalculada = 0;
        }

        if (verificaSePodeViajar(distancia) >= distancia) {
            motor.percorre(distancia);
            tanque.gasta(motor.combustivelNecessario(distancia));
            return true;
        }
        return false;
    }

    public int getQuilometragem(){
        return motor.getQuilometragem();
    }

    public void setConsumo(int consumo){
        motor.setConsumo(consumo);
    }

    public int getConsumo(){
        return motor.getConsumo();
    }

    @Override
    public String toString() {
        return "Carro:\n  Modelo=" + modelo + "\n  Motor=" + motor + "\n  Tanque=" + tanque;
    }
}
