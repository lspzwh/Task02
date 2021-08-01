package Exception;

public class Task {

    public static void main(String[] args) {
        int i = 2;
        boolean flag=true;
        while(flag){
            try {
                if (i > Integer.MAX_VALUE / 2) {
                    flag=false;
                    throw new MyException("数值越上界");
                }else i*=2;
            }catch (MyException e){
                e.printStackTrace();
            }
        }
    }

}
