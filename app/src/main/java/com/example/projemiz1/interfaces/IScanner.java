package com.example.projemiz1.interfaces;

import android.graphics.Bitmap;

import com.example.projemiz1.enums.ScanHint;

/**
 * Interface between activity and surface view
 */

public interface IScanner {
    void displayHint(ScanHint scanHint);
    void onPictureClicked(Bitmap bitmap);
}
