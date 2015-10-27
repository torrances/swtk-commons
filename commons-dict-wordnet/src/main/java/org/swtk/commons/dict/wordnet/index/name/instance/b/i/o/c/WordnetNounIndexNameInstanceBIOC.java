package org.swtk.commons.dict.wordnet.index.name.instance.b.i.o.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBIOC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"biocatalyst\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14748070\"]}");
	add("{\"term\":\"biochemist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09874321\"]}");
	add("{\"term\":\"biochemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06089170\"]}");
	add("{\"term\":\"biochip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02844879\"]}");
	add("{\"term\":\"bioclimatology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06129103\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }