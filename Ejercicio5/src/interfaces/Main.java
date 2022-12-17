package interfaces;

public class Main {

    public static void main(String[] args) {

        CocheCRUDImpl CocheCrud = new CocheCRUDImpl();

        CocheCrud.save();
        CocheCrud.findAll();
        CocheCrud.delete();
    }

}
