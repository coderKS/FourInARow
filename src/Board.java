import java.util.BitSet;

public class Board {
	
//	the board is composed by 7*6 square 
//	it can constructed by bits
//	Squares are 0-42 left to right, bottom to top.
//	two bits represent one square, so 84 bits in total
//	both bits are 0 = empty square
//	less significant is set = not empty
//	most significant bits is set = red, else yellow
	
	private BitSet board; 
	
	//singleton is used here
	private static Board instance = null;
	
	protected Board(){
		this.board = new BitSet(84);
	}
	public static Board getBoard(){
		if (instance == null){
			instance = new Board();
		}
		return instance;
	}
	
	
	public void newBoard(){
		this.board = new BitSet(84);
	}
	
	public BitSet getBitSet(){

		return this.board;
	}
	
	public String getBit(){
		String s = "";
		// not finished
		//it should return sth like "11001101"
		return s;

	}

    //print the broad in console 
	//not finished
	public String display(){
		String output = "";
		for(int i=0;i<42;i++){
			if (i > 0 &&  i % 7 ==0 ){
				output += "\n";
			}
			
		
		}
		
		return output;
	}
	
	
	
	
	
}
