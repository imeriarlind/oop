package session7;

public class SemaforiEnum {

    enum NgjyraSemafori {E_KUQE, E_VERDHE, E_GJELBER};

    public static void main(String[] args) {

        NgjyraSemafori ngjyra = NgjyraSemafori.E_VERDHE;

        switch(ngjyra){
            case E_KUQE:
                System.out.println("Ndal!");
                break;
            case E_VERDHE:
                System.out.println("Behu gati!");
                break;
            case E_GJELBER:
                System.out.println("Nisu!!");
                break;
        }
        System.out.println(".....");
    }
}
