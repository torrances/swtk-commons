package org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.q;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREQ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"request\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07199985\", \"06525357\"]}");
	add("{\"term\":\"requester\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10439776\"]}");
	add("{\"term\":\"requiem\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01044693\", \"07047400\", \"07064659\"]}");
	add("{\"term\":\"requiem shark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01491559\"]}");
	add("{\"term\":\"requiescat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07205244\"]}");
	add("{\"term\":\"required course\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00893716\"]}");
	add("{\"term\":\"requirement\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05901034\", \"09390100\", \"05901258\"]}");
	add("{\"term\":\"requirements contract\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06536102\"]}");
	add("{\"term\":\"requisite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09390100\"]}");
	add("{\"term\":\"requisiteness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14474370\"]}");
	add("{\"term\":\"requisition\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00088038\", \"06487871\", \"07206900\"]}");
	add("{\"term\":\"requisition form\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06487871\"]}");
	add("{\"term\":\"requital\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01237702\", \"13321851\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }