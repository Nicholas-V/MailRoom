package mailroom.utilities;

public class NoSuchListException extends RuntimeException{
    public NoSuchListException(String str){
        super(str);
    }
}
