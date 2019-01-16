
public class Main {

	public static void main(String[] args) {
		
		//Variable that receive the number from the args
		Integer number = Integer.parseInt(args[0]);
		
		//Total numbers of td that we have to print
		Integer totalBlocks = number * number;
 
		//Array to keep the spiral values
        Integer[][] spiral = new Integer[number][number];
        
        //Initialization of the parameters to iterate
        Integer value = 1;         
        Integer firstCol = 0;
        Integer lastCol = number-1;
        Integer firstRow = 0;
        Integer lastRow = number-1;
        
        //creating and accumulating the numbers 
        while (value <= number*number){
        	
        	//evaluating the spiral
            for (int i = firstCol; i <= lastCol; i++){
                spiral[firstRow][i] = value;
                value++;
            }
            
            //evaluating the spiral
            for (int i = firstRow+1; i <= lastRow; i++) { 
                spiral[i][lastCol] = value; 
                value++; 
            } 
             
            //evaluating the spiral
            for (int i = lastCol-1; i >= firstCol; i--){
                spiral[lastRow][i] = value;
                value++;
            }
             
            //evaluating the spiral
            for (int i = lastRow-1; i >= firstRow+1; i--){
                spiral[i][firstCol] = value;
                value++;
            }
             
            //updating the control variables
            firstCol++;
            firstRow++;
            lastCol--;
            lastRow--;
        }
        
        //Variable to save the return
        String result = "<table border=\"1\">\r\n"; 
        for (int i = 0; i < spiral.length; i++){
        	result = result + "<tr> ";
            for (int j = 0; j < spiral.length; j++){
            	result = result + "<td>"+spiral[i][j]+"</td>";
            }
            result = result + " </tr>\r\n";
        }
        result = result + "</table>";
        
        //Variables to keep the parameters to print the file
        String path = "C:/SpiralCase/";
        String filename = "SpiralCaseResult.html";
        
        //Object to print the file
        Writer writer = new Writer();
        writer.setText(result);
        writer.writing(path, filename);

           
    }		

}
