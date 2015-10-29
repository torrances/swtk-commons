package org.swtk.commons.dict.wordnet.indexbyname.instance.o.b.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOBE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"obeah\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06235798\", \"08169195\"]}");
	add("{\"term\":\"obeche\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12222455\", \"12222751\"]}");
	add("{\"term\":\"obechi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12222455\"]}");
	add("{\"term\":\"obedience\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01135185\", \"04913450\", \"01169636\"]}");
	add("{\"term\":\"obedience plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12372307\"]}");
	add("{\"term\":\"obedient plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12882876\"]}");
	add("{\"term\":\"obeisance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01169636\", \"07289130\"]}");
	add("{\"term\":\"obelion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05241645\"]}");
	add("{\"term\":\"obelisk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06841579\", \"03843389\"]}");
	add("{\"term\":\"oberson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09569409\"]}");
	add("{\"term\":\"obesity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05007507\"]}");
	add("{\"term\":\"obesity diet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07580194\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }