package org.swtk.commons.dict.wiktionary.generated.y.a.y;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYAY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yayo", "{\"term\":\"yayo\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\"], \"text\":\"Spanish \u0027llello\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"cocain\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, Lil\u0027 Jon and the East Side Boyz (Jonathan Mortimer Smith), \u0027Grand Finale\u0027 (rap song\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"We \u0027\u0027yayo\u0027\u0027 experts, we been whippin\u0027 the yola / Since the crackas decided to take the coke from Coca-Cola\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2009\u0027\u0027, Christine A. Nandi, \u0027The ABC\u0027s of Raising a Successful Student\u0027 (page 7\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"They just spend their time sniffing up the \u0027\u0027\u0027yayo\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }