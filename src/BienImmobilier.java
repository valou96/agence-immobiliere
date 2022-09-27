import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class BienImmobilier {
    
    private String _rue;
    private String _ville;
    private String _codePostal;
    private Vendeur _vendeur;
    private ArrayList<Piece> _pieces;


    public BienImmobilier(String _rue, String _ville, String _codePostal, Vendeur _vendeur) {
        this._rue = _rue;
        this._ville = _ville;
        this._codePostal = _codePostal;
        this._vendeur = _vendeur;
    }


    public Double surfaceHabitable(){
        Double result = 0.0;
        for(Piece piece : _pieces){
            if(piece.get_typePiece().isSurfaceHabitable()){
                result = result + piece.surface();
            }
        }
        return result;
    }

    public Double surfaceNonHabitable(){
        Double result = 0.0;
        for(Piece piece : _pieces){
            if(piece.get_typePiece().isSurfaceHabitable()== false){
                result = result + piece.surface();
            }
        }
        return result;


    }


    public void ajouterPiece(Piece piece){
        _pieces.add(piece);
    }
    
    @Override
    public String toString() {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        return "\nLocalisation : " + _rue +" " + _codePostal + " " + _ville + 
        "\n \n Description du bien : \n" +
        _pieces.toString()  +  
        "\nPour une surface habitable de : " + 
        numberFormat.format(surfaceHabitable())+ 
        " m2 et une surface non habitable de : " + 
        numberFormat.format(surfaceNonHabitable())+" m2.";
    }

   
}
