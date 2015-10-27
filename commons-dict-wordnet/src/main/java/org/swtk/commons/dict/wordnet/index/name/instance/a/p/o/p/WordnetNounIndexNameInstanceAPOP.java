package org.swtk.commons.dict.wordnet.index.name.instance.a.p.o.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAPOP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"apophasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07116315\"]}");
	add("{\"term\":\"apophatism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05950822\"]}");
	add("{\"term\":\"apophthegm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07167838\"]}");
	add("{\"term\":\"apophysis\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05480756\", \"13109220\"]}");
	add("{\"term\":\"apoplexy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14105785\"]}");
	add("{\"term\":\"apoptosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11506781\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }