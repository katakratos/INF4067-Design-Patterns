package construction_composite;

public class FichierTxt extends Element {
	 public FichierTxt(String name) {
	        super(name, "Txt");
	    }

	    public void ajouter(Element element) {
	        // Ne peut pas ajouter d'élément à un fichier TXT
	        System.out.println("Impossible d'ajouter un élément à un fichier TXT.");
	    }

	    public void supprimer(Element element) {
	        // Ne peut pas supprimer d'élément d'un fichier TXT
	        System.out.println("Impossible de supprimer un élément d'un fichier TXT.");
	    }

	    public Element getElement(int index) {
	        // Ne peut pas obtenir d'élément d'un fichier TXT
	        return null;
	    }
}
