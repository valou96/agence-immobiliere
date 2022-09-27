public class PieceTrapezoidale extends Piece {
    
    private Double _hauteur;
    private Double _baseBasse;
    private Double _baseHaute;

    public PieceTrapezoidale(TypePiece _typePiece, String _niveau, Double _hauteur, Double _baseBasse, Double _baseHaute) {
        super(_typePiece,_niveau);
        this._hauteur = _hauteur;
        this._baseBasse = _baseBasse;
        this._baseHaute = _baseHaute;
    }

    public Double get_hauteur(){
        return _hauteur;
    }

    public Double get_baseBasse(){
        return _baseBasse;
    }

    public Double get_baseHaute(){
        return _baseHaute;
    }

    @Override
    public double surface(){
        double result;
        result = ((_baseBasse + _baseHaute) * _hauteur) / 2;
        return result;
    }

} 