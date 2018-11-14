public class TokenPass {
    private int[] board;
    private int playerCount;

    public TokenPass (int playerCount)
    {
        board = new int [playerCount];
        for (int i = 0; i <= board.length-1; i++)
        {
            board[i] = (int) Math.random()*10+1;
        }
        int currentPlayer = (int) Math.random()*(playerCount-1);
    }

    public void distributeCurrentPlayerTokens()
    {
        int token = board[currentPlayer];
    }
}
