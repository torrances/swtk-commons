package org.swtk.commons.dict.wordnet.indexbyname.instance.d.e.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dew\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14858302\"]}");
	add("{\"term\":\"dew point\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05020826\"]}");
	add("{\"term\":\"dew worm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01938036\"]}");
	add("{\"term\":\"dewar\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10952447\", \"03190552\"]}");
	add("{\"term\":\"dewar flask\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03190552\"]}");
	add("{\"term\":\"dewberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07761173\", \"12675148\"]}");
	add("{\"term\":\"dewberry bush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12675148\"]}");
	add("{\"term\":\"dewdrop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13924551\"]}");
	add("{\"term\":\"dewey\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10952649\", \"10952835\", \"10953017\"]}");
	add("{\"term\":\"dewey decimal classification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05735372\"]}");
	add("{\"term\":\"dewey decimal system\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05735372\"]}");
	add("{\"term\":\"dewitt clinton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10922161\"]}");
	add("{\"term\":\"dewlap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05247023\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }