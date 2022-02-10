
import java.util.List;
import java.util.Scanner;

public class Quizz {

    List<Cursa > curse;
    public Scanner sc = new Scanner(System.in);

    public Quizz(List<Cursa > curse){
        this.curse = curse;
    }

    public void start(){
        Client client = new Client();
        int raspuns;
        System.out.println("Bun venit in meniul aplicatiei!");
        System.out.println("1. Client\n2. Sofer");
        raspuns = sc.nextInt();
        if(raspuns == 1) {
            System.out.println("Nume si prenume Client sau exit pentru a reveni la meniu");

            System.out.println("nume");
            String nume = sc.next();
            client.setNume(nume);

            if(nume != null) {
                System.out.println("prenume");
                String prenume = sc.next();
                client.setPrenume(prenume);
            }



            if(nume != "exit") {
                System.out.println("Distanta la care te aflii in km ");
                int distanta = sc.nextInt();
                client.distanta = distanta;

                int calcul = 0;
                int compare = 600;
                for(Cursa cursa : curse){
                    calcul = distanta - cursa.getMasini().getDistanta();
                    if( calcul < compare)
                        compare = calcul;

                    for(Cursa cursa2 : curse){
                        calcul = distanta - cursa.getMasini().getDistanta();
                        if(calcul == compare && (cursa2.getAprobare() != false))
                            System.out.println(curse.toString());
                    }

                }

            }


            System.out.println("Distanta la care te aflii in km");

        }
        else {
            Sofer sofer = new Sofer();
            System.out.println("Nume si prenume sofer");
            System.out.println("nume");
            String nume = sc.next();
            sofer.setNume(nume);

            if (nume != null) {
                System.out.println("prenume");
                String prenume = sc.next();
                sofer.setPrenume(prenume);
            }

            if (nume != "exit") {

                for (Cursa cursa : curse)
                    if (cursa.getMasini().getSofer() == sofer) {
                        System.out.println("1. aproba cursa\n2. nu aproba");
                        int aprobare = sc.nextInt();
                        if (aprobare == 1)
                            cursa.setAprobare(true);
                        else
                            cursa.setAprobare(false);

                    }
            }
        }




    }

}