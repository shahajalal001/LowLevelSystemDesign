package CreationalPattern.PrototypePattern.Problem;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    private final List<GamePiece> pieces = new ArrayList<>();

    public void addPiece(GamePiece piece){
        pieces.add(piece);
    }

    public List<GamePiece> getPieces(){
        return  pieces;
    }

    public void showBoardState(){
        for(GamePiece piece: pieces){
            System.out.println(piece);
        }
    }
}
