

public class Storey {

    private Flat[] flats;

    Storey(int cFlats) {
        flats = new Flat[cFlats];
        for (int i = 0; i < flats.length; i++) {
            flats[i] = new Flat();
        }
    }
    public void addPeople(int flat,int people){
        flats[flat].addPeople(people);
    }
    public void printPeople(){
        for(int i = 0; i< flats.length;i++){
            System.out.println(" \tFlat "+ i+ " : "+flats[i].getPeople());
        }
    }
}
