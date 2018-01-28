package algorytmy2.MyList;

import jdk.nashorn.api.tree.WhileLoopTree;

public class MyList {

    private int counter = 0;
    private Element head;
    private Element tail;

    public int getCounter() {
        return counter;
    }

    public Element getHead() {
        return head;
    }

    public Element getTail() {
        return tail;
    }

    public Element findForward(int value) {

        Element currentElement = head;

        if (currentElement.getData() == value)
            return currentElement;

        while (currentElement.getNext() != null) {

            currentElement = currentElement.getNext();

            if (currentElement.getData() == value)
                return currentElement;

        }
        return null;
    }

    public Element findBackwards(int value) {

        Element currentElement = tail;

        while (currentElement.getPrev() != null) {
            currentElement = currentElement.getPrev();
            if (currentElement.getData() == value)
                return currentElement;
        }
        return null;

    }

    private void setFirstElement(Element newElement) {

        head = newElement;
        tail = newElement;
        newElement.setNext(null);
        newElement.setPrev(null);
        counter++;
    }

    public void addAtBeginning(int value) {
        Element newElement = new Element();
        newElement.setData(value);

        if (counter > 0) {
            newElement.setNext(head);
            head = newElement;
            newElement.setPrev(null);
            Element nextOfNewElement = newElement.getNext();
            nextOfNewElement.setPrev(newElement);
//            newElement.getNext().setPrev(newElement);  -  skrocona wersja
            counter++;

        } else {
            setFirstElement(newElement);
        }
    }

    public void atTheEnd(int value) {
        Element newElement = new Element();
        newElement.setData(value);
        if (counter > 0) {
            newElement.setNext(null);
            newElement.setPrev(tail);
            tail = newElement;
            Element prevOfNewElement = newElement.getPrev();
            prevOfNewElement.setNext(newElement);
            counter++;
        } else {
            setFirstElement(newElement);
        }

    }

    public void addElementAfterElement(int newValue, int valueInsertAfter) throws Exception {
        Element elementafter = findForward(valueInsertAfter);

        if (elementafter == null) {

            throw new Exception("nie ma wartosci");
        }
        if (elementafter == tail) {
            atTheEnd(newValue);
        } else {
            Element newElement = new Element();
            newElement.setData(newValue);
            newElement.setNext(elementafter.getNext());
            newElement.setPrev(elementafter);

            Element oldAfterElement = newElement.getNext();
            oldAfterElement.setPrev(newElement);
            elementafter.setNext(newElement);
            //           newElement.getNext().setPrev(newElement);   skrocona wersja
            counter++;
        }
    }

    public void addElementBeforElement(int newValue, int valueInsertAfter) throws Exception {
        Element elementBefor = findForward(valueInsertAfter);

        if (elementBefor== null) {

            throw new Exception("nie ma wartosci");
        }
        if (elementBefor == head) {
            addAtBeginning(newValue);
        } else {
            Element newElement = new Element();
            newElement.setData(newValue); //ustawiam wartosci nowego elementu
            newElement.setNext(elementBefor);//ustawiam wskaznik dla nowego elementu na nastepny element
            newElement.setPrev(elementBefor.getPrev());//ustawiam wskaznik dla nowego elementu na element, ktory element nastepny

            elementBefor.setPrev(newElement);//ustawiam wskaznik elementu przed nowym elementem
            Element oldBeforElement = newElement.getPrev();//ustawiam wskazniki elementu przed nowym elementem
            oldBeforElement.setNext(newElement);
            elementBefor.setNext(newElement);
            //           newElement.getNext().setPrev().setNext(newElement);   skrocona wersja
            counter++;
        }
    }

    public void deleteElement(int value) throws Exception {
        Element elementToDelete = findForward(value);
        if(elementToDelete==null){
            throw new Exception("Nie ma takiego elementu");
        }
        if(elementToDelete !=head && elementToDelete!=tail){
            Element elementBeforeElementToDelete = elementToDelete.getPrev();
            elementBeforeElementToDelete.setNext(elementToDelete.getNext());

            Element elementAfterElementToDelete = elementToDelete.getNext();
            elementAfterElementToDelete.setPrev(elementToDelete.getPrev());
        }
        if(elementToDelete==head){
            head = head.getNext();
            head.setPrev(null);
        }
        if(elementToDelete==tail){
            tail=tail.getPrev();
            tail.setNext(null);
        }



        counter--;
    }

//DEBUG
    public void printAll() {
        Element currentElement = head;

        while (true) {
            System.out.println(currentElement.getData()+" ");

            if(currentElement.getNext() !=null)
            currentElement = currentElement.getNext();

            else
                break;

        }

    }
}
