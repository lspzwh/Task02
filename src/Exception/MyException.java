package Exception;

class MyException extends Exception{
    public MyException() {
        super();
    }
    public MyException(String message){
        super(message);
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}