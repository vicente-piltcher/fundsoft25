public class Motor {

    private TipoCombustivel tipoMotor;
    private int consumo1; // em quilometros por unidade. Ex: Km/Lt
    private int consumo2;
    private int consumeLevel;
    public boolean alreadyDecided = false;
    private int quilometragem;
    public int quilometragemCalculada;

    public Motor(TipoCombustivel tipoMotor, int consumo) {
        this.tipoMotor = tipoMotor;
        this.consumo1 = consumo;
    }

    public Motor(TipoCombustivel tipoMotor, int consumoComb1, int consumoComb2) {
        this.tipoMotor = tipoMotor;
        this.consumo1 = consumoComb1;
        this.consumo2 = consumoComb2;    
    }

    public void setConsumo(int consumo) {this.consumo1 = consumo;}

    public int getConsumo() {
        return this.consumo1;
    }

    public boolean defineConsume(int consume){
        if (consume >= 1 && consume <= 2){
            this.consumeLevel = consume;
            this.alreadyDecided = true;
            return true;
        }
        return false;
    }

    public TipoCombustivel getTipoMotor(){
        return this.tipoMotor;
    }

    public int getQuilometragem(){
        return this.quilometragem;
    }

    public int combustivelNecessario(int distancia) {
        if (this.consumeLevel == 2) {
            return distancia / consumo2;
        }
        return distancia / consumo1;
    }

    public void percorre(int distancia) {
        quilometragem += distancia;
        quilometragemCalculada += distancia;
    }

    @Override
    public String toString() {
        return "Motor [consumo=" + consumo1 + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoMotor + "]";
    }
}