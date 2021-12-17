package Factories;

public class SerialNumberGenerator {
    
    private static SerialNumberGenerator serialNumberGenerator;
    private Integer serialNumber = 0;

    private SerialNumberGenerator() {

    }
    
    public static SerialNumberGenerator getInstance(){
        if(serialNumberGenerator == null){
            serialNumberGenerator = new SerialNumberGenerator();
        }
        return serialNumberGenerator;
    }
    
    public Integer next(){
        return serialNumber++;
    }
    
}
