package org.swtk.commons.dict.wordnet.index.name.instance.d.i.c.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDICK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dick\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05534354\", \"10031439\"]}");
	add("{\"term\":\"dickens\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10954161\", \"07140494\"]}");
	add("{\"term\":\"dickey\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03196245\", \"03196460\"]}");
	add("{\"term\":\"dickeybird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01506617\"]}");
	add("{\"term\":\"dickhead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09834593\"]}");
	add("{\"term\":\"dickie\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03196245\", \"03196460\"]}");
	add("{\"term\":\"dickinson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10954362\"]}");
	add("{\"term\":\"dicksonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13211367\"]}");
	add("{\"term\":\"dicksoniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13211116\"]}");
	add("{\"term\":\"dicky\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03196245\", \"03196460\"]}");
	add("{\"term\":\"dickybird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01506617\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }