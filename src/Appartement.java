public class Appartement extends BienImmobilier{
    
    private String _etage;
    private Boolean _ascenseur;


    public Appartement(String _rue, String _ville, String _codePostal, Vendeur _vendeur, String _etage) {
        super(_rue, _ville, _codePostal, _vendeur);
        this._etage = _etage;
        
    }


    public Appartement(String _rue, String _ville, String _codePostal, Vendeur _vendeur, String _etage,
            Boolean _ascenseur) {
        super(_rue, _ville, _codePostal, _vendeur);
        this._etage = _etage;
        this._ascenseur = _ascenseur;
    }

    public String typeBien(){
        int nbPiece = 0 ;
        for(Piece _pieces : _pieces){
            if(_pieces.get_typePiece().isPiece()){
                nbPiece ++;
            }
        }
        if (nbPiece > 7){
            return "T7+";
        }

        return "T0";
    }


    @Override
    public String toString() {
        String resultat ="";
        resultat = "Appartement de type "+ typeBien();
        if(_ascenseur){
            resultat += " avec ascenseur ";
        }
        resultat += " situé au " + _etage + " ";
        resultat += super.toString();
        return resultat;
    }

   

    
}
