package chicken_fight;
public class status {
    
    private String nome;
    private String raça;
    private int maxEnerg;
    private int energ;
    private int maxPower;
    private int power;
    private int maxCansaco;
    private int cansaco;

    public status(String nome, String raça, int maxEnerg, int energ, int maxPower, int power, int maxCansaco, int cansaco) {
        this.nome = nome;
        this.raça = raça;
        this.maxEnerg = maxEnerg;
        this.energ = energ;
        this.maxPower = maxPower;
        this.power = power;
        this.maxCansaco = maxCansaco;
        this.cansaco = cansaco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public int getMaxEnerg() {
        return maxEnerg;
    }

    public void setMaxEnerg(int maxEnerg) {
        this.maxEnerg = maxEnerg;
    }

    public int getEnerg() {
        return energ;
    }

    public void setEnerg(int energ) {
        this.energ = energ;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxCansaco() {
        return maxCansaco;
    }

    public void setMaxCansaco(int maxCansaco) {
        this.maxCansaco = maxCansaco;
    }

    public int getCansaco() {
        return cansaco;
    }

    public void setCansaco(int cansaco) {
        this.cansaco = cansaco;
    }
    
    public void luta(){
    double roll;
    roll = Math.floor(Math.random() * (10 + 1)) % 2;
     System.out.println("-----------------------------");
    System.out.println("Seu galo foi lutar");
        System.out.println("-----------------------------");
    if (roll == 0){
            System.out.println("Infelizmente ele tomou um kct :C");
            this.cansaco = cansaco + 10;
            this.power = power - 10;
            this.energ = energ - 20;
} else{
        System.out.println("Seu galinho foi vencedor :D ");
        this.cansaco = cansaco + 2;
        this.power = power + 10;
        this.energ = energ - 25;
    }
 }
    public void descanso(){
    double roll;
    roll = Math.floor(Math.random() * (10*1))%2;
        System.out.println("-----------------------------");
        System.out.println("Seu galo foi de sonecas");
        System.out.println("-----------------------------");
        if (roll==0){
            System.out.println("Tirou uma boa soneca");
            this.cansaco = cansaco - 10;
            this.energ = energ + 10;
            
        } else{
            System.out.println("Seu galo teve um sono profetico e acordou bravo");
            this.power = power + 25;
            this.cansaco = cansaco + 4;
            this.energ = energ + 6;
    }
    }
    public void mostrar(){
        System.out.println("--Dados do Galinho--");
        System.out.println("Cansaco: " + cansaco + "/" + maxCansaco);
        System.out.println("Energia: " + energ + "/" + maxEnerg);
        System.out.println("Poder: " + power + "/" + maxPower);
    }
}
