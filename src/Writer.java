import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Writer{
	
	private String text;
	
	public Writer() {

	}
	
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }	
	
    //method to write the file
    public void writing(String path, String filename) {
        try {
            File statText = new File(path+filename);
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            BufferedWriter w = new BufferedWriter(osw);
            w.write(text);
            w.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file "+filename);
        }
    }

}