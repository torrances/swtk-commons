package org.swtk.commons.dict.wordnet.index.name.instance.c.i.t.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCITR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"citrange\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07766275\", \"12733080\"]}");
	add("{\"term\":\"citrate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14628362\"]}");
	add("{\"term\":\"citrin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15117704\"]}");
	add("{\"term\":\"citrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14837237\"]}");
	add("{\"term\":\"citron\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12730109\", \"07766425\"]}");
	add("{\"term\":\"citroncirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12732909\"]}");
	add("{\"term\":\"citronwood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11663957\", \"12730351\"]}");
	add("{\"term\":\"citrulline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14628464\"]}");
	add("{\"term\":\"citrullus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12184166\"]}");
	add("{\"term\":\"citrus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12728541\", \"07763031\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }