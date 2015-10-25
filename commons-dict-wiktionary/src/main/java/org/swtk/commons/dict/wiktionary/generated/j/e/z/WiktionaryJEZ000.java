package org.swtk.commons.dict.wiktionary.generated.j.e.z;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJEZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("jezebel", "{\"term\":\"jezebel\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Hebrew\"], \"text\":\"From Hebrew \u0027אִיזֶבֶל\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The Phoenician princess and Queen of Ancient Israel who appears in the Old Testament (1 Kings). She incited heresy and lured the Jews away from their God and back to idols. Jezebel was finally deposed by Jehu, who confronted her and had her thrown from the palace window to the streets, where her body was eaten by wild dogs\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"section\u003dchapter passage\u003d“I know if anyone called me a carrot-topped \u0027\u0027Jezebel\u0027\u0027, umbrage is the first thing I\u0027d take. Who was \u0027\u0027Jezebel\u0027\u0027, by the way? The name seems familiar, but I can\u0027t place her.” “A character in the Old Testament, sir. A queen of Israel.” “Of course, yes. Be forgetting my own name next. Eaten by dogs, wasn\u0027t she?” “Yes, sir.” “Can\u0027t have been pleasant for her.” “No, sir.” “Still, that\u0027s the way the ball rolls.”\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }