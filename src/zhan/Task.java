package zhan;

public class Task {
    public static void main(String[] args) {
        Inn inn=new Inn(100);
        inn.TenTo16(30);
    }
}
class Inn{
    int max;
    int[] data;
    int top;
    int length;
    public Inn(int max){
        this.max=max;
        this.data=new int[max];
        this.length=0;
        this.top=-1;
    }
    public boolean push(int d){
        if (this.max==this.length){
            System.out.println("栈已满");
            return false;
        }
        top++;
        length++;
        data[top]=d;
        return true;
    }
    public int pop(){
        int re=data[top];
        top--;
        length--;
        return re;
    }
    public boolean empty(){
        return top == -1;
    }
    public int peek(){
        return data[top];
    }
    public boolean search(int d){
        for(int i = 0; i<length; i++){
            if(d==data[i])return true;
        }
        return false;
    }
    public void TenTo2(int a){
        while(a!=0){
            push(a%2);
            a/=2;
        }
        for(int i=0;length!=0;i++){
            System.out.print(pop());
        }
    }
    public void TenTo8(int a){
        while(a!=0){
            push(a%8);
            a/=8;
        }
        for(int i=0;length!=0;i++){
            System.out.print(pop());
        }
    }
    public void TenTo16(int a){
        while(a!=0){
            push(a%16);
            a/=16;
        }
        for(int i=0;length!=0;i++){
            int x=pop();
            switch (x) {
                case 10 -> System.out.print("A");
                case 11 -> System.out.print("B");
                case 12 -> System.out.print("C");
                case 13 -> System.out.print("D");
                case 14 -> System.out.print("E");
                case 15 -> System.out.print("F");
                default -> System.out.print(x);
            }
        }
    }
}

