package org.swtk.commons.dict.wiktionary.generated.z.a.c;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryZAC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("zachary", "{\"term\":\"zachary\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"English vernacular form of Zacharias, Zachariah and Zechariah\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Unto whom I will give for leaders, Abraham, Isaac, and Jacob, Oseas, Amos, and Micheas, Joel, Abdias, and Jonas, Nahum, and Abacuc, Sophonias, Aggeus, \u0027\u0027Zachary\u0027\u0027, and Malachy, which is called also an angel of the Lord\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1605\u0027\u0027 w:William William Camden, \u0027Remains Concerning Britain\u0027, John Russell Smith, 1870, p.56\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Albeit in our late Reformation, some of good consideration have brought in \u0027\u0027Zachary\u0027\u0027, Malachy, Josias, \u0026amp;c. as better agreeing with our faith, but without contempt of countrey names (as I hope), which have both good and gracious significations\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"2003\u0027\u0027 Alan Grayson, \u0027Mile End\u0027, PageFree Publishing Inc., ISBN 158961092X, page 366\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"quot;\u0027\u0027Zachary\u0027\u0027!\u0026quot; Her lips smacked at the name. \u0026quot;That\u0027s not a...well,a...Jewish name, is it?\u0026quot\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"quot;Oh yes, Zechariah, my father was born in the U.S.S.R., in Podolsk, and my mother\u0027s family came from Russia also, a long time ago. I suppose it\u0027s Russian or something.\u0026quot\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"quot;Russian? It doesn\u0027t sound Russian.\u0026quot\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"quot;Well I don\u0027t know exactly; my mother liked \u0027\u0027Zachary\u0027\u0027 Scott in the pictures.\u0026quot\", \"priority\":9}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }