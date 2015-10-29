package org.swtk.commons.dict.wordnet.indexbyname.instance.d.i.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDID {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"didacticism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06612774\"]}");
	add("{\"term\":\"didactics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00884975\"]}");
	add("{\"term\":\"didanosine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03195581\"]}");
	add("{\"term\":\"diddley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13795187\"]}");
	add("{\"term\":\"diddly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13795187\"]}");
	add("{\"term\":\"diddlyshit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13795187\"]}");
	add("{\"term\":\"diddlysquat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13795187\"]}");
	add("{\"term\":\"didelphidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01877425\"]}");
	add("{\"term\":\"didelphis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01877806\"]}");
	add("{\"term\":\"didelphis marsupialis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01877954\"]}");
	add("{\"term\":\"didelphis virginiana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01877954\"]}");
	add("{\"term\":\"dideoxycytosine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03195447\"]}");
	add("{\"term\":\"dideoxyinosine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03195581\"]}");
	add("{\"term\":\"diderot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10954509\"]}");
	add("{\"term\":\"didion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10954776\"]}");
	add("{\"term\":\"dido\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09581306\"]}");
	add("{\"term\":\"didrikson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11424662\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }