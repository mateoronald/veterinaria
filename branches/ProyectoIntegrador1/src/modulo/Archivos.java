package modulo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Archivos {
	
	private String filDocumentoFileName;
	private String filDocumentoContentType;
	private byte[] filDocumentoArreglo;
	
	public String getFilDocumentoFileName() {
		return filDocumentoFileName;
	}
	public void setFilDocumentoFileName(String filDocumentoFileName) {
		this.filDocumentoFileName = filDocumentoFileName;
	}
	public String getFilDocumentoContentType() {
		return filDocumentoContentType;
	}
	public void setFilDocumentoContentType(String filDocumentoContentType) {
		this.filDocumentoContentType = filDocumentoContentType;
	}
	public byte[] getFilDocumentoArreglo() {
		return filDocumentoArreglo;
	}
	public void setFilDocumentoArreglo(byte[] filDocumentoArreglo) {
		this.filDocumentoArreglo = filDocumentoArreglo;
	}
	
	public byte[] getBytesFromFile(File file) throws IOException {
		if (file != null) {
			InputStream is = new FileInputStream(file);

			byte[] bytes = new byte[(int) file.length()];

			int offset = 0;
			int numRead = 0;
			while (offset < bytes.length
					&& (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
				offset += numRead;
			}

			is.close();
			return bytes;
		} else {
			return null;
		}

	}
}
