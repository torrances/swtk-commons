package org.swtk.commons.dict.wordnet.index.name.instance.c.a.t.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCATT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cattail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12176100\"]}");
	add("{\"term\":\"cattalo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02410409\"]}");
	add("{\"term\":\"cattell\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10911180\", \"10911321\"]}");
	add("{\"term\":\"cattie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13739833\"]}");
	add("{\"term\":\"cattiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04849746\"]}");
	add("{\"term\":\"cattle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02405077\"]}");
	add("{\"term\":\"cattleman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09992191\", \"09921470\"]}");
	add("{\"term\":\"cattleship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02989803\"]}");
	add("{\"term\":\"cattleya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12071002\"]}");
	add("{\"term\":\"catty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13739833\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }