import utils.*;

public class Ahnenbaum {
    private BinaryTree<Ahne> SaschasAhnenbaum;

    Ahnenbaum(){
        BinaryTree<Ahne> b1= new BinaryTree<Ahne> (new Ahne("Oma","Axt", 'W'));
        BinaryTree<Ahne> b2= new BinaryTree<Ahne> (new Ahne("Opa","Axt", 'M'));
        BinaryTree<Ahne> b3= new BinaryTree<Ahne> (new Ahne("Elvira","Kosych", 'W'),b1,b2);
        BinaryTree<Ahne> b4= new BinaryTree<Ahne> (new Ahne("Oma","Kosych", 'W'));
        BinaryTree<Ahne> b5= new BinaryTree<Ahne> (new Ahne("Opa","Kosych", 'M'));
        BinaryTree<Ahne> b6= new BinaryTree<Ahne> (new Ahne("Valeri","Kosych", 'M'),b4,b5);
        SaschasAhnenbaum = new BinaryTree<Ahne>(new Ahne("Sascha", "Kosych", 'M'), b3, b6);
    }
}