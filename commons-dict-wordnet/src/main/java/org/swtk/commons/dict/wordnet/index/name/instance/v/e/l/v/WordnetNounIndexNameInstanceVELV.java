package org.swtk.commons.dict.wordnet.index.name.instance.v.e.l.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVELV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"velveeta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07871293\"]}");
	add("{\"term\":\"velvet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04532333\"]}");
	add("{\"term\":\"velveteen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04532486\"]}");
	add("{\"term\":\"velvetleaf\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12193586\", \"12203132\"]}");
	add("{\"term\":\"velvetweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12193586\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }