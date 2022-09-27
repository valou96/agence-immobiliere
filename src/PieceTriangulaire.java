public class PieceTriangulaire extends Piece {
    
    private Double _base;
    private Double _hauteur;

    public PieceTriangulaire(TypePiece _typePiece, String _niveau, Double _base, Double _hauteur) {
        super(_typePiece,_niveau);
        this._base = _base;
        this._hauteur = _hauteur;
    }

    public Double get_base(){
        return _base;
    }

    public Double get_hauteur(){
        return _hauteur;
    }

    @Override
    public double surface(){
        double result;
        result = (_base * _hauteur) / 2;
        return result;
    }

} 