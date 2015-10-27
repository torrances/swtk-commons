package org.swtk.commons.dict.wordnet.index.name.instance.l.i.t.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLITT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"litter\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02823567\", \"03683688\", \"14882443\", \"08417288\"]}");
	add("{\"term\":\"litterateur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10084212\"]}");
	add("{\"term\":\"litterbin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03683884\"]}");
	add("{\"term\":\"litterbug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10286863\"]}");
	add("{\"term\":\"litterer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10286863\"]}");
	add("{\"term\":\"little\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13784857\"]}");
	add("{\"term\":\"littleneck\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01960987\", \"07803084\"]}");
	add("{\"term\":\"littleness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04841304\", \"05038522\", \"05113933\"]}");
	add("{\"term\":\"littoral\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08613632\"]}");
	add("{\"term\":\"littorina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01950925\"]}");
	add("{\"term\":\"littorinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01950795\"]}");
	add("{\"term\":\"littre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11155361\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }