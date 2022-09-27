public class PieceParallelogramme extends Piece {
    
    private Double _hauteur;
    private Double _base;

    public PieceParallelogramme(TypePiece _typePiece, String _niveau, Double _hauteur, Double _base) {
        super(_typePiece,_niveau);
        this._hauteur = _hauteur;
        this._base = _base;
    }

    public Double get_hauteur(){
        return _hauteur;
    }

    public Double get_base(){
        return _base;
    }

    @Override
    public double surface(){
        double result;
        result = _base * _hauteur;
        return result;
    }

} 