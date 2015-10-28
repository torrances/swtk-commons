package org.swtk.commons.dict.wordnet.indexbyname.instance.u.n.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUNU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ununbium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14683973\"]}");
	add("{\"term\":\"ununhexium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14684101\"]}");
	add("{\"term\":\"ununpentium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14684231\"]}");
	add("{\"term\":\"ununquadium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14684362\"]}");
	add("{\"term\":\"ununtrium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14684493\"]}");
	add("{\"term\":\"unusefulness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05157835\"]}");
	add("{\"term\":\"unusualness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04804544\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }