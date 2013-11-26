package FlyWeight;


import java.util.ArrayList;
import java.util.List;
/**
 * 
 *作者：alaric
 *时间：2013-7-27下午4:52:26
 *描述：行 不可共享享元
 */
public class Row implements Glyph {

	private List<Character> list = new ArrayList<Character>();
	
	
	@Override
	public void draw(Context context) {
		
	}

	public Row() {
	}

	public void setCharacter(Glyph r){
		list.add((Character) r);
	}

	public int getSize(){
		return list.size();
	}
	
	public String getRow(){
		StringBuilder sb = new StringBuilder();
		for(Character g:list){
			sb.append(g.getC());
		}
		
		return sb.toString();
	}

}
