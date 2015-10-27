package org.swtk.commons.dict.wordnet.index.name.instance.m.a.c.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMACA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"macaca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02489848\"]}");
	add("{\"term\":\"macadam\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04401723\", \"15001634\"]}");
	add("{\"term\":\"macadamia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12241708\"]}");
	add("{\"term\":\"macamba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12604603\"]}");
	add("{\"term\":\"macao\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08749256\"]}");
	add("{\"term\":\"macaque\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02489978\"]}");
	add("{\"term\":\"macaroni\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07716709\", \"10297960\"]}");
	add("{\"term\":\"macaroon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07652143\"]}");
	add("{\"term\":\"macarthur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11166660\"]}");
	add("{\"term\":\"macau\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08749256\"]}");
	add("{\"term\":\"macaulay\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11166904\"]}");
	add("{\"term\":\"macaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01821156\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }