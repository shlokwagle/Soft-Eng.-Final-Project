import java.awt.event.ActionEvent;

public abstract class Controller {
	abstract int getBoardValue(int i,int j);
	abstract void setBoardValue(int i,int j,int token);
	abstract int []nextWinningMove(int token);
	abstract int inverse(int token);
	abstract boolean isWin(int token);

}
