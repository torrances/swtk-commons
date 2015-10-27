package org.swtk.commons.dict.wordnet.index.name.instance.l.e.m.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEMO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"lemon\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03661164\", \"05724289\", \"12732356\", \"04973720\", \"07765558\"]}");
	add("{\"term\":\"lemonade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07942490\"]}");
	add("{\"term\":\"lemongrass\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12124901\", \"15126734\"]}");
	add("{\"term\":\"lemonwood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12690564\", \"12690774\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }