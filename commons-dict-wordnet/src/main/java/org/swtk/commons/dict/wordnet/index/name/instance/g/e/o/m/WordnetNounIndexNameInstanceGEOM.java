package org.swtk.commons.dict.wordnet.index.name.instance.g.e.o.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGEOM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"geomancer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10147453\"]}");
	add("{\"term\":\"geomancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05784872\"]}");
	add("{\"term\":\"geometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10147553\"]}");
	add("{\"term\":\"geometrician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10147553\"]}");
	add("{\"term\":\"geometrid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02289656\"]}");
	add("{\"term\":\"geometridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02289467\"]}");
	add("{\"term\":\"geometry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06014015\"]}");
	add("{\"term\":\"geomorphology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06127462\"]}");
	add("{\"term\":\"geomyidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02356181\"]}");
	add("{\"term\":\"geomys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02356361\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }