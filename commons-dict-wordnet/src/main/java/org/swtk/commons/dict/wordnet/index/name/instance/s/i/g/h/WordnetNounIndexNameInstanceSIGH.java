package org.swtk.commons.dict.wordnet.index.name.instance.s.i.g.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSIGH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sigh\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07408356\", \"07144310\"]}");
	add("{\"term\":\"sight\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"13796604\", \"00883327\", \"05631601\", \"06220699\", \"05662207\", \"06901994\", \"05941790\"]}");
	add("{\"term\":\"sightedness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05664382\"]}");
	add("{\"term\":\"sighting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00881947\"]}");
	add("{\"term\":\"sightlessness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14150142\"]}");
	add("{\"term\":\"sightreader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10615925\"]}");
	add("{\"term\":\"sights\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04224030\"]}");
	add("{\"term\":\"sightseeing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00881285\"]}");
	add("{\"term\":\"sightseer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10616097\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }