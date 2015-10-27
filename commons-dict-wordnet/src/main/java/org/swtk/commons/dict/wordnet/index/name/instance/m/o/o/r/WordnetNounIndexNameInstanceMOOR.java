package org.swtk.commons.dict.wordnet.index.name.instance.m.o.o.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMOOR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"moor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09381648\", \"09742775\"]}");
	add("{\"term\":\"moorage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00052966\", \"08657686\", \"13343889\"]}");
	add("{\"term\":\"moorbird\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01799160\"]}");
	add("{\"term\":\"moorcock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01799441\"]}");
	add("{\"term\":\"moore\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"11209264\", \"11209422\", \"11209569\", \"11209699\", \"11209819\", \"11210014\"]}");
	add("{\"term\":\"moorfowl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01799160\"]}");
	add("{\"term\":\"moorgame\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01799160\"]}");
	add("{\"term\":\"moorhen\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01799370\", \"02019470\"]}");
	add("{\"term\":\"mooring\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03790008\", \"08657686\"]}");
	add("{\"term\":\"moorish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05852214\"]}");
	add("{\"term\":\"moorland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09381648\"]}");
	add("{\"term\":\"moorwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12250168\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }