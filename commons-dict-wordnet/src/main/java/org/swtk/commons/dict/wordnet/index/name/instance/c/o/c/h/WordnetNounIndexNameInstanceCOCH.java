package org.swtk.commons.dict.wordnet.index.name.instance.c.o.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOCH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cochimi\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06935262\", \"09672719\"]}");
	add("{\"term\":\"cochin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01793453\"]}");
	add("{\"term\":\"cochineal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02252932\", \"15011584\"]}");
	add("{\"term\":\"cochise\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10923322\"]}");
	add("{\"term\":\"cochlea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05334172\"]}");
	add("{\"term\":\"cochlearia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11904268\"]}");
	add("{\"term\":\"cochlearius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02013810\"]}");
	add("{\"term\":\"cochran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10923474\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }