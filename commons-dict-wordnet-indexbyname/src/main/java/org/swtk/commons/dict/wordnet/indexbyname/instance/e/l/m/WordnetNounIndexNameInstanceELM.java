package org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceELM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"el misti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09197463\"]}");
	add("{\"term\":\"el muerto\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09295833\"]}");
	add("{\"term\":\"elm\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12426660\", \"12426219\"]}");
	add("{\"term\":\"elm family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12425448\"]}");
	add("{\"term\":\"elm tree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12426219\"]}");
	add("{\"term\":\"elmer ambrose sperry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11331006\"]}");
	add("{\"term\":\"elmer leopold rice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11279625\"]}");
	add("{\"term\":\"elmer reizenstein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11279625\"]}");
	add("{\"term\":\"elmer rice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11279625\"]}");
	add("{\"term\":\"elmont\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09146919\"]}");
	add("{\"term\":\"elmore john leonard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11148226\"]}");
	add("{\"term\":\"elmore leonard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11148226\"]}");
	add("{\"term\":\"elmwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12426660\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }