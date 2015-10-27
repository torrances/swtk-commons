package org.swtk.commons.dict.wordnet.index.name.instance.n.a.t.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNATI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"naticidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01950515\"]}");
	add("{\"term\":\"nation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08320622\", \"11221051\", \"08183451\", \"08185877\"]}");
	add("{\"term\":\"national\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09648571\"]}");
	add("{\"term\":\"nationalisation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01154283\", \"01154795\", \"01154956\"]}");
	add("{\"term\":\"nationalism\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05974062\", \"07500187\", \"05973889\", \"04885296\"]}");
	add("{\"term\":\"nationalist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10365746\", \"10427055\"]}");
	add("{\"term\":\"nationality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13977005\", \"07966049\"]}");
	add("{\"term\":\"nationalization\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01154283\", \"01154795\", \"01154956\"]}");
	add("{\"term\":\"nationhood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13949484\"]}");
	add("{\"term\":\"native\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00019226\", \"09644402\", \"09643964\"]}");
	add("{\"term\":\"nativeness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04807130\"]}");
	add("{\"term\":\"nativism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05982065\", \"06673413\"]}");
	add("{\"term\":\"nativist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09648846\"]}");
	add("{\"term\":\"nativity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06202643\", \"07334902\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }