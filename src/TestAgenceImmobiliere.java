import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAgenceImmobiliere {
    
    @Test
    public void testMethodSurfacePieceCirculaire(){
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        PieceCirculaire uncercle = new PieceCirculaire(cuisine, "1",6.2 );
        assertEquals(120.7016, uncercle.surface(),1e-2);
        }

        @Test
        public void testMethodSurfacePieceParallelogramme(){
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        PieceParallelogramme unParallelogramme = new PieceParallelogramme(cuisine, "1",6.2,2.2 );
        assertEquals(13.64, unParallelogramme.surface(),1e-2);
        }

        
        @Test
        public void testMethodSurfacePieceQuadrilatere(){
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        PieceQuadrilatere unQuadrilatere = new PieceQuadrilatere(cuisine, "1",6.2,2.2 );
        assertEquals(13.64, unQuadrilatere.surface(),1e-2);
        }

        @Test
        public void testMethodSurfacePieceTrapezoidale(){
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        PieceTrapezoidale unQuadrilatere = new PieceTrapezoidale(cuisine, "1",6.2,2.2, 4.2 );
        assertEquals(19.84, unQuadrilatere.surface(),1e-2);
        }

        @Test
        public void testMethodSurfacePieceTriangulaire(){
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        PieceTriangulaire unTriangle = new PieceTriangulaire(cuisine, "1",6.2,2.2 );
        assertEquals(6.82, unTriangle.surface(),1e-2);
        }


        @Test
        public void testMethodSurfaceHabitable(){
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        PieceTriangulaire unTriangle = new PieceTriangulaire(cuisine, "1",6.2,2.2 );
        assertEquals(6.82, unTriangle.surfaceHabitable(),1e-2);
        }

        @Test
        public void testMethodSurfaceNonHabitable(){
        TypePiece cuisine = new TypePiece(TypePiece.CUISINE, true, false);
        PieceTriangulaire unTriangle = new PieceTriangulaire(cuisine, "1",6.2,2.2 );
        assertEquals(6.82, unTriangle.surface(),1e-2);
        }
        

}
