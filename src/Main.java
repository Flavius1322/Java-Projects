
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { Scanner sc = new Scanner(System.in);

        Sofer sofer1 = new Sofer("Ionel", "Marcel");
        Sofer sofer2 = new Sofer("Irinel", "Marcel");
        Sofer sofer3 = new Sofer("Rosu", "Marcel");
        Sofer sofer4 = new Sofer("Radu", "Radu");
        Sofer sofer5 = new Sofer("Popescu", "Mircea");

        Masina masina1 = new Masina(sofer1,20,20);
        Masina masina2 = new Masina(sofer2,25,30);
        Masina masina3 = new Masina(sofer3,10,10);
        Masina masina4 = new Masina(sofer4,2,5);
        Masina masina5 = new Masina(sofer5,70,90);


        Cursa cursa1 = new Cursa(false,masina1);
        Cursa cursa2 = new Cursa(true,masina2);
        Cursa cursa3 = new Cursa(false,masina3);
        Cursa cursa4 = new Cursa(true,masina4);
        Cursa cursa5 = new Cursa(false,masina5);

        List<Cursa> curse = new ArrayList<Cursa>();
        curse.add(cursa1);
        curse.add(cursa2);
        curse.add(cursa3);
        curse.add(cursa4);
        curse.add(cursa5);

        System.out.println("Totate Cursele\n" + curse.toString());

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
                for(Cursa cursaA : curse){
                    calcul = distanta - cursaA.getMasini().getDistanta();
                    if( calcul < compare)
                        compare = calcul;

                    for(Cursa cursaB : curse){
                        calcul = distanta - cursaB.getMasini().getDistanta();
                        if(calcul == compare && (cursa2.getAprobare() != false))
                            System.out.println(cursaB.toString());
                    }

                }

            }


            System.out.println("Distanta la care te aflii in km");

        }
        else {

            System.out.println("Nume si prenume sofer");
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
