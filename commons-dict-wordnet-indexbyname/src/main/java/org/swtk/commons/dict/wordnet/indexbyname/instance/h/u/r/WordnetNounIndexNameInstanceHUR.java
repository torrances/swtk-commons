package org.swtk.commons.dict.wordnet.indexbyname.instance.h.u.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHUR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hurdle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00121335\", \"05699206\", \"03554769\"]}");
	add("{\"term\":\"hurdler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10213483\"]}");
	add("{\"term\":\"hurdles\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07484302\"]}");
	add("{\"term\":\"hurdling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07484302\"]}");
	add("{\"term\":\"hurl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00106299\"]}");
	add("{\"term\":\"hurler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10455755\"]}");
	add("{\"term\":\"hurling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00471905\"]}");
	add("{\"term\":\"hurok\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11087735\"]}");
	add("{\"term\":\"huron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09354441\"]}");
	add("{\"term\":\"hurrah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06705718\"]}");
	add("{\"term\":\"hurricane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11487417\"]}");
	add("{\"term\":\"hurriedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05067358\"]}");
	add("{\"term\":\"hurry\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00556685\", \"05067358\", \"14474655\"]}");
	add("{\"term\":\"hurrying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00330986\"]}");
	add("{\"term\":\"hurt\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00403900\", \"07435138\", \"07510467\", \"07511603\", \"14309164\"]}");
	add("{\"term\":\"hurting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14346126\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }