package org.swtk.commons.dict.wordnet.indexbyname.instance.t.o.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tobacco\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12928225\", \"04449965\"]}");
	add("{\"term\":\"tobacconist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04450391\", \"10733572\"]}");
	add("{\"term\":\"tobago\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08773885\"]}");
	add("{\"term\":\"tobagonian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10733703\"]}");
	add("{\"term\":\"tobey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11364087\"]}");
	add("{\"term\":\"tobin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11364230\"]}");
	add("{\"term\":\"tobit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06471351\"]}");
	add("{\"term\":\"toboggan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04450567\"]}");
	add("{\"term\":\"tobogganing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00448206\"]}");
	add("{\"term\":\"tobogganist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10733844\"]}");
	add("{\"term\":\"tobramycin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04450722\"]}");
	add("{\"term\":\"toby\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04450900\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }