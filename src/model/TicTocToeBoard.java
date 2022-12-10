package model;


import java.util.ArrayList;
import java.util.List;

public class TicTocToeBoard {
    int n;

    ArrayList<ArrayList<Character>> board;

    public TicTocToeBoard(int n) {
        this.n = n;
        this.board = new ArrayList<>();
        for(int i=0; i< n;i++) {
            ArrayList<Character> row = new ArrayList<>();
            for(int j=0; j< n;j++) {
               row.add(' ');
            }
            this.board.add(row);
        }
    }

    @Override
    public String toString() {

        String ret = "TicTocToe Borad : \n";
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                ret+= " [" + board.get(i).get(j) + "] ";
            }
            ret+= "\n";
        }
        return ret;
    }

    public int getSize() {
        return n;
    }

    public void setValue(int i, int j, char c) {
        if(i<n && j<n)
            board.get(i).set(j,c);
    }

    public Character getValue(int i, int j) {
        if(i<n && j<n)
            return board.get(i).get(j);
        return null;
    }

    public boolean evaluate() {
        for(int i=0;i<n;i++) {
            ArrayList<Character> row = new ArrayList<>();
            for(int j=0;j<n;j++) {
                row.add(board.get(i).get(j));
            }
            System.out.println("DEBUG : "+row);
            if(row.contains(' ')) continue;
            if(row.stream().filter(c -> c!=' ').distinct().limit(2).count() == 1) return true;
        }
        for(int j=0;j<n;j++) {
            ArrayList<Character> col = new ArrayList<>();
            for(int i=0;i<n;i++) {
                col.add(board.get(i).get(j));
            }
            System.out.println("DEBUG : "+col);
            if(col.contains(' ')) continue;
            if(col.stream().filter(c -> c!=' ').distinct().limit(2).count() == 1) return true;
        }

        ArrayList<Character> d1 = new ArrayList<>();
        ArrayList<Character> d2 = new ArrayList<>();
        for(int j=0;j<n;j++) {
                d1.add(board.get(j).get(j));
        }
        System.out.println("DEBUG : "+d1);
        if(!d1.contains(' ') && d1.stream().filter(c -> c!=' ').distinct().limit(2).count() == 1) return true;
        for(int j=0;j<n;j++) {
            d2.add(board.get(j).get(n-1-j));
        }
        System.out.println("DEBUG : "+d2);
        if(!d2.contains(' ') &&d2.stream().filter(c -> c!=' ').distinct().limit(2).count() == 1) return true;
        return false;
    }

    public boolean isFull() {
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(board.get(i).get(j)==' ') return false;
            }
        }
        return true;
    }
}
