package calculatorm;

class CalcException extends Exception {
    public CalcException() {
        System.out.println("Не правильно задано выражение");
    }
    
    public CalcException(String message){
        this();
        System.out.println(message);
    }
}
