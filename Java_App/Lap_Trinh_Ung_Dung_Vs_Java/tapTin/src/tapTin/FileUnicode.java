package tapTin;

import java.awt.Dialog;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class FileUnicode {
	String tenFile;
	String noiDung;
	String fileDich;
	
	public FileUnicode(String tenFile, String noiDung, String fileDich) {
		this.tenFile = tenFile;
		this.noiDung = noiDung;
		this.fileDich = fileDich;
	}
	/*
	 * đọc tập tin Unicode
	 * */
	
	public void docFile() {
		try {
			InputStream fileInput = new FileInputStream(tenFile);
			InputStreamReader reader = new InputStreamReader(fileInput);
			int data = reader.read();
			while(data != -1) {
				System.out.write(data);
				data = fileInput.read();
			}
			fileInput.close();
		} catch (Exception e) {
			System.err.println("error " + e);
		}
	}
	
//	public void taoFile() {
//		boolean ketQua = true;
//		try {
//			OutputStream outPut = new FileOutputStream(tenFile);
//			OutputStreamWriter writer = new OutputStreamWriter(outPut, "UTF-8");
//			
//		}
//
//	}
	public boolean copyFile() {
		String source = tenFile;
		String destination = fileDich;
		try {
			InputStream input = new FileInputStream(source);
			OutputStream output = new FileOutputStream(destination);
			
			int data = input.read();
			while(data != -1){
				output.write(data);
				data = input.read();
			}
			input.close();
			output.close();
			
		} catch (IOException ioe) {
			System.err.println("Error" + ioe);
			return false;
		}
		return true;
	}
	public boolean copyFileBuffer() {
		try {
			FileInputStream input = new FileInputStream(tenFile);
			ReadableByteChannel source = input.getChannel();
			
			 FileOutputStream output = new FileOutputStream(fileDich);
			 WritableByteChannel destination = output.getChannel();
			 
			 ByteBuffer buffer = ByteBuffer.allocateDirect(10*1024);
			 while(source.read(buffer) != -1) {
				 buffer.flip();
				 while(buffer.hasRemaining()) {
					 destination.write(buffer);
				 }
				 buffer.clear();
			 }
			 input.close();
			 output.close();
			 source.close();
			 destination.close();
			
			 
		} catch (IOException e) {
			System.out.println("Error" + e.getMessage() );
			return false;
		}
		return true;
	}

}
