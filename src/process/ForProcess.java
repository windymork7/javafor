package process;

public class ForProcess {

    public int su;

    public ForProcess(int su) {
        this.su = su;
    }

    public void moon1() {
        for (int i = 0; i < su; i++) {
            for (int j = 0; j < su; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void moon2() {
        for (int i = 0; i < su; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void moon3(){

        for (int i = 0; i < su; i++) {
            int cnt = su -i - 1;
            for (int j = 0; j < cnt; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public void moon4(){
        for (int i = 0; i < su; i++) {
            int cnt = su -i -1;
            for (int j = 0; j < cnt; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (i*2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void moon5(){
        for (int i = 0; i < su; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (su*2)-(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void moon6(){
        for (int i = 0; i < su; i++) {
            int cnt = su -i -1;
            for (int j = 0; j < cnt; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (i*2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < su-1; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((su-1)*2)-(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void moon7(){
        for (int i = 0; i < su; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (su*2)-(i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < su-1; i++) {
            int cnt = su -i -1;
            for (int j = 0; j < cnt-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= ((i+1)*2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
