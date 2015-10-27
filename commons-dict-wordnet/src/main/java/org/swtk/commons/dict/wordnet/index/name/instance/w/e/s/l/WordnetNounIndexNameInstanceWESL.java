package org.swtk.commons.dict.wordnet.index.name.instance.w.e.s.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWESL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wesley\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11401819\", \"11401959\"]}");
	add("{\"term\":\"wesleyan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10332431\"]}");
	add("{\"term\":\"wesleyanism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06241834\"]}");
	add("{\"term\":\"wesleyism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06241834\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }