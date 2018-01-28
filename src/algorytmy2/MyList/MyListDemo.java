package algorytmy2.MyList;

public class MyListDemo {
    public static void main(String[] args) {
//dodawanie elementow na poczatku i koncu listy
        MyList lista = new MyList();
        lista.addAtBeginning(9);
        lista.addAtBeginning(8);
        lista.addAtBeginning(7);
        lista.addAtBeginning(6);
        lista.addAtBeginning(5);

        lista.atTheEnd(110);
        lista.atTheEnd(109);
        lista.atTheEnd(108);
        lista.atTheEnd(107);

        System.out.println();

        try{
            lista.addElementAfterElement(1000,107);
            lista.addElementAfterElement(1100,5);
        }catch(Exception e){
            e.getMessage();

        }
        lista.printAll();
        System.out.println("----------");
        try{
            lista.deleteElement(1100);
            lista.deleteElement(1000);
            lista.deleteElement(5);
        }catch(Exception e){
            e.getMessage();
        }

        lista.printAll();


    }
}
