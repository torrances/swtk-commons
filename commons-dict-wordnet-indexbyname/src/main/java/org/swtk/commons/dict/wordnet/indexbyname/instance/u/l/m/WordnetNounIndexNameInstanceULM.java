package org.swtk.commons.dict.wordnet.indexbyname.instance.u.l.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceULM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ulmaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12425448\"]}");
	add("{\"term\":\"ulmus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12425714\"]}");
	add("{\"term\":\"ulmus alata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12426809\"]}");
	add("{\"term\":\"ulmus americana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12426993\"]}");
	add("{\"term\":\"ulmus campestris sarniensis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12428971\"]}");
	add("{\"term\":\"ulmus campestris wheatleyi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12428971\"]}");
	add("{\"term\":\"ulmus carpinifolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12427220\"]}");
	add("{\"term\":\"ulmus crassifolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12427407\"]}");
	add("{\"term\":\"ulmus glabra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12427584\"]}");
	add("{\"term\":\"ulmus hollandica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12427727\"]}");
	add("{\"term\":\"ulmus hollandica vegetata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12427901\"]}");
	add("{\"term\":\"ulmus laevis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12428050\"]}");
	add("{\"term\":\"ulmus parvifolia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12428220\"]}");
	add("{\"term\":\"ulmus procera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12428395\"]}");
	add("{\"term\":\"ulmus pumila\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12428582\"]}");
	add("{\"term\":\"ulmus rubra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12428785\"]}");
	add("{\"term\":\"ulmus sarniensis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12428971\"]}");
	add("{\"term\":\"ulmus serotina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12429222\"]}");
	add("{\"term\":\"ulmus thomasii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12429378\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }