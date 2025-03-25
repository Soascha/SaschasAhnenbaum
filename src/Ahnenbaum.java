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

    
    public void preorderAusgabe() {
        besuchePreOrder(SaschasAhnnenbaum);
    }

    private void besuchePreOrder(BinaryTree<Ahne> b) {
        if (!b.isEmpty()) {
            System.out.println(b.getContent().getVorname());
        }
        if (!b.getLeftTree().isEmpty()) {
            besuchePreOrder(b.getLeftTree());
        }
        if (!b.getRightTree().isEmpty()) {
            besuchePreOrder(b.getRightTree());
        }


    }

    public void inorderAusgabe() {
        besucheInOrder(SaschasAhnnenbaum);
    }


    private void besucheInOrder(BinaryTree<Ahne> b) {
        if (!b.isEmpty()) {
            if (!b.getLeftTree().isEmpty()) {
                besucheInOrder(b.getLeftTree());
            }
            System.out.println(b.getContent().getVorname());

            if (!b.getRightTree().isEmpty()) {
                besucheInOrder(b.getRightTree());
            }
        }
    }

    public void postorderAusgabe() {
        besuchePostOrder(SaschasAhnnenbaum);
    }

    private void besuchePostOrder(BinaryTree<Ahne> b) {
        if (!b.isEmpty()) {
            if (!b.getLeftTree().isEmpty()) {
                besuchePostOrder(b.getLeftTree());
            }
            if (!b.getRightTree().isEmpty()) {
                besuchePostOrder(b.getRightTree());
            }
            System.out.println(b.getContent().getVorname());
        }


    }

public void inorderAusgabe(){
        besuche(SaschasAhnnenbaum);
}

private void besuche(BinaryTree<Ahne>){

}










}
