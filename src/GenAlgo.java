import java.util.Random;

public class GenAlgo {
    private boolean[][] current;

    public void gen(boolean[][]current,int size) {
        boolean[][]next = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int n = i == 0 ? size - 1 : i - 1;
                int w = j == 0 ? size - 1 : j - 1;
                int s = i == size - 1 ? 0 : i + 1;
                int e = j == size - 1 ? 0 : j + 1;

                int neib = 0;
                int aliveCounter = 0;

                if (current[i][w]) {
                    neib++;
                } if (current[i][e]) {
                    neib++;
                } if (current[n][j]) {
                    neib++;
                } else if (current[s][j]) {
                    neib++;
                } else if (current[n][w]) {
                    neib++;
                } else if (current[n][e]) {
                    neib++;
                } else if (current[s][w]) {
                    neib++;
                } else if (current[s][e]) {
                    neib++;
                }

                if (current[i][j] && (neib < 2 || neib > 3)) {
                    next[i][j] = false;
                } else if (!current[i][j] && neib == 3) {
                    next[i][j] = true;
                }
                if (next[i][j]) {
                    aliveCounter++;
                }
            }
        }
        setCurrent(next);
    }

    public void setCurrent(boolean[][] current) {
        this.current = current;
    }

    public boolean[][] getCurrent() {
        return current;
    }

    public void firstGeneration(int size) {
        Random random = new Random();
        boolean[][] first = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                first[i][j] = random.nextBoolean();
            }
        }
        setCurrent(first);
    }
}
