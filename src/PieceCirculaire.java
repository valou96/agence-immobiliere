public class PieceCirculaire extends Piece {
    
    private Double _rayon;
    private Double _pi = 3.14;

    public PieceCirculaire(Double _rayon, Double _pi, TypePiece _typePiece, String _niveau) {
        super(_typePiece,_niveau);
        this._rayon = _pi;
        this._rayon = _rayon;
    }

    public Double get_rayon(){
        return _rayon;
    }

    @Override
    public double surface(){
        double result;
        result = _pi * (_rayon * _rayon);
        return result;
    }

} 