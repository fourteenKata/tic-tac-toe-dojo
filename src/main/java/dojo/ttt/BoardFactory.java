package dojo.ttt;

public final class BoardFactory {

    private BoardFactory() {}

    /**
     * @return empty board
     */
    public static Board createBoard() {
        return new MapBoard(); 
    }

    /**
     * @param tokens 'X', 'O' or '-' (empty)
     * @return new board based on the tokens
     */
    public static Board createBoard(char... tokens) {
    	return new MapBoard(tokens);
    }

}