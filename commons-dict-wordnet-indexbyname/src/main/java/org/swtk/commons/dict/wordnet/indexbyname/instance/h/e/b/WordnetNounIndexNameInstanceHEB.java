package org.swtk.commons.dict.wordnet.indexbyname.instance.h.e.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHEB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hebbel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11057832\"]}");
	add("{\"term\":\"hebdomad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15194920\"]}");
	add("{\"term\":\"hebe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09584069\"]}");
	add("{\"term\":\"hebei\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08743759\"]}");
	add("{\"term\":\"hebephrenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14422842\"]}");
	add("{\"term\":\"hebetude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05689093\"]}");
	add("{\"term\":\"hebraism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08110979\"]}");
	add("{\"term\":\"hebraist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10187041\"]}");
	add("{\"term\":\"hebrew\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09700747\", \"06999784\"]}");
	add("{\"term\":\"hebrews\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06458146\", \"08500946\"]}");
	add("{\"term\":\"hebrides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08913450\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }