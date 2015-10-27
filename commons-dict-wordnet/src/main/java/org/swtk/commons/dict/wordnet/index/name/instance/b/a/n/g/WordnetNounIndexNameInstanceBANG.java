package org.swtk.commons.dict.wordnet.index.name.instance.b.a.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBANG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bang\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00065324\", \"07543858\", \"05266468\", \"07390857\", \"07424807\"]}");
	add("{\"term\":\"bangalore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08923320\"]}");
	add("{\"term\":\"banger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03349961\", \"07693605\"]}");
	add("{\"term\":\"bangiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01417897\"]}");
	add("{\"term\":\"banging\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01178605\", \"07391139\"]}");
	add("{\"term\":\"bangkok\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09059355\"]}");
	add("{\"term\":\"bangla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06983620\"]}");
	add("{\"term\":\"bangladesh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08867723\"]}");
	add("{\"term\":\"bangladeshi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09711390\"]}");
	add("{\"term\":\"bangle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02790458\", \"02891211\"]}");
	add("{\"term\":\"bangor\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08908594\", \"08915481\", \"09115526\"]}");
	add("{\"term\":\"bangtail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02385600\"]}");
	add("{\"term\":\"bangui\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08736634\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }