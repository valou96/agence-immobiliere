public class PieceQuadrilatere extends Piece {
    
    private Double _longueur;
    private Double _largeur;

    public PieceQuadrilatere(TypePiece _typePiece, String _niveau, Double _longueur, Double _largeur) {
        super(_typePiece,_niveau);
        this._longueur = _longueur;
        this._largeur = _largeur;
    }

    public Double get_longueur(){
        return _longueur;
    }

    public Double get_largeur(){
        return _largeur;
    }

    @Override
    public double surface(){
        double result;
        result = _longueur * _largeur;
        return result;
    }

} 