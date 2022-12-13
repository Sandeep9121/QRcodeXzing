package com.example.demo;

import java.io.IOException;

import com.google.zxing.WriterException;

public interface QRCodeGeneratorService {
	void generateQRCodeImage(String text, int width, int height, String filePath) throws WriterException, IOException;
	byte[] getQRCodeImage(String text, int width, int height) throws WriterException, IOException ;
	       
}
