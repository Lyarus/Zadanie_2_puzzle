package com.pram.larisa.zadanie_2_puzzle;

import android.content.Context;

public class PuzzlePiece extends android.support.v7.widget.AppCompatImageView {
    public int xCoord;
    public int yCoord;
    public int pieceWidth;
    public int pieceHeight;
    public boolean canMove = true;

    public PuzzlePiece(Context context) {
        super(context);
    }
}