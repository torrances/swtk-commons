package org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceORM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ormandy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11236787\"]}");
	add("{\"term\":\"ormazd\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09555087\"]}");
	add("{\"term\":\"ormer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01945728\"]}");
	add("{\"term\":\"ormolu\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14995097\"]}");
	add("{\"term\":\"ormosia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12573819\"]}");
	add("{\"term\":\"ormuzd\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09555087\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }