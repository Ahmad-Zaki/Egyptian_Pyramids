import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PyramidCSVDAO {
	private List<Pyramid> pyramids;
	
	public PyramidCSVDAO() {
		this.pyramids = new ArrayList<Pyramid>();
	}
	
	public List<Pyramid> readPyramidsFromCSV(String fileName){
		File data = new File(fileName); //Create an file object with the specified path.
		List<String> lines = new ArrayList<String>();
		
		try {
			lines = Files.readAllLines(data.toPath()); //Read the content of the file as lines
		} catch (IOException e) {
			System.out.println("while reading the file "+ fileName + ", an error occured:" + e);
		}
		
		//Extract fields from each line and create pyramid objects:
		for (String line:lines) {
			String[] fields = line.split(",");
			for (int i=0; i<fields.length; i++) {
				fields[i] = fields[i].trim();
			}
			Pyramid pyramid = createPyramid(fields);
			pyramids.add(pyramid);
		}

		return pyramids;		
	}
	
	public Pyramid createPyramid(String[] metadata) {
		String pharoah = metadata[0];
		String modern_name=metadata[2];
		String site = metadata[4];
		double height;
		try {
			height = Double.parseDouble(metadata[7]); //Convert height from string to double to match Pyramid class constructor.
		} catch(Exception e) {
			height = -1;
		}
		
		
		return new Pyramid(pharoah, modern_name, site, height);
	}
}
