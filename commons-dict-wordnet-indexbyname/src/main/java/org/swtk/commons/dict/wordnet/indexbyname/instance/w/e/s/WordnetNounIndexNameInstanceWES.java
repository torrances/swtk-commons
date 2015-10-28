package org.swtk.commons.dict.wordnet.indexbyname.instance.w.e.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWES {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"weser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09500848\"]}");
	add("{\"term\":\"wesley\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11401819\", \"11401959\"]}");
	add("{\"term\":\"wesleyan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10332431\"]}");
	add("{\"term\":\"wesleyanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06241834\"]}");
	add("{\"term\":\"wesleyism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06241834\"]}");
	add("{\"term\":\"wessex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08906863\"]}");
	add("{\"term\":\"west\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"08579372\", \"11402107\", \"11402273\", \"11402393\", \"13858335\", \"08700557\", \"13856598\", \"08700313\"]}");
	add("{\"term\":\"wester\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11545913\"]}");
	add("{\"term\":\"westerly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11546047\"]}");
	add("{\"term\":\"western\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07714417\", \"06628388\"]}");
	add("{\"term\":\"westerner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10793997\"]}");
	add("{\"term\":\"westernisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13595785\"]}");
	add("{\"term\":\"westernization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13595785\"]}");
	add("{\"term\":\"westinghouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11402550\"]}");
	add("{\"term\":\"westminster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08895774\"]}");
	add("{\"term\":\"weston\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11402683\"]}");
	add("{\"term\":\"westward\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13856598\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }