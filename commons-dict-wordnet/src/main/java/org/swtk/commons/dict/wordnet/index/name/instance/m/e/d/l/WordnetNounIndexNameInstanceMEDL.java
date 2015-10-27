package org.swtk.commons.dict.wordnet.index.name.instance.m.e.d.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMEDL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"medlar\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07782867\", \"07782978\", \"12656985\", \"12691519\"]}");
	add("{\"term\":\"medlars\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06650779\"]}");
	add("{\"term\":\"medley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07061563\"]}");
	add("{\"term\":\"medline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03747729\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }