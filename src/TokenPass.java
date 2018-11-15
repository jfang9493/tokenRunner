public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass (int playerCount)
    {
        board = new int [playerCount];
        for (int i = 0; i <= board.length-1; i++)
        {
            board[i] = (int) ((Math.random()*10)+1);
        }
        int currentPlayer = (int) (Math.random()*(playerCount-1));
    }

    public void distributeCurrentPlayerTokens()
    {
        int nextPlayer = currentPlayer;
        int numToDistribute =  board[currentPlayer];
        board[currentPlayer] = 0;
        while (currentPlayer > 0 )
        {
            nextPlayer = (nextPlayer +1) % board.length;
            board[nextPlayer]++;
            numToDistribute--;
        }
    }

    public void printBoard()
    {
        for (int i = 0; i <= board.length - 1;i++)
        {
            System.out.print("Player " + i + ": " + board[i] + " ");
        }
        System.out.print("\n");
        System.out.print("Current Player: " + currentPlayer);
        System.out.print("\n");
    }

    public void nextPlayer()
    {
        currentPlayer++;
    }

    public int gameOver()
    {
        for (int i = 0; i < board.length - 1; i++)
        {
            if (board[i] == 0) return i;
        }
        return -1;
    }
}
