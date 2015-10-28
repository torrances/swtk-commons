package org.swtk.commons.dict.wordnet.indexbyname.instance.v.o.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVOY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"voyage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00313379\", \"00313610\"]}");
	add("{\"term\":\"voyager\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10780858\"]}");
	add("{\"term\":\"voyeur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10780994\"]}");
	add("{\"term\":\"voyeurism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00739670\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }