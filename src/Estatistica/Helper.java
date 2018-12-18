package Estatistica;

public  class Helper {
    
    
    public static double round(double value, int decimal){
        
        int exp = (int)Math.pow(10, decimal);
        value *= exp;
        int roundedValue = (int)Math.round(value);
        
        return roundedValue / (double)exp;
    }
}
