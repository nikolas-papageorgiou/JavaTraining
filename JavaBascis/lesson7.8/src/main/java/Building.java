
public class Building {


    private Storey[] storeys;
    Building(int cStoreys,int cFlats){
        storeys = new Storey[cStoreys];
        for (int i = 0;i<cStoreys;i++){
            storeys[i] = new Storey(cFlats);
        }
    }

    public void addPeople(int storey,int flat, int people){
        storeys[storey].addPeople(flat,people);
    }
    void printPeople(){
        for(int i =0;i< storeys.length;i++){
            System.out.println("Storey "+i);
            storeys[i].printPeople();
            System.out.println();
        }
    }
}

