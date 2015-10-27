package org.swtk.commons.dict.wordnet.index.name.instance.b.r.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"brasenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11738990\"]}");
	add("{\"term\":\"brashness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04669640\", \"04825931\"]}");
	add("{\"term\":\"brasier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02896680\"]}");
	add("{\"term\":\"brasil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08872733\"]}");
	add("{\"term\":\"brasilia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08874300\"]}");
	add("{\"term\":\"brasov\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08832185\"]}");
	add("{\"term\":\"brass\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"02895442\", \"08234056\", \"02895545\", \"04845441\", \"08181484\", \"02895029\", \"14741158\"]}");
	add("{\"term\":\"brassard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02895633\"]}");
	add("{\"term\":\"brassavola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12067814\"]}");
	add("{\"term\":\"brasserie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02895740\"]}");
	add("{\"term\":\"brassia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12068055\"]}");
	add("{\"term\":\"brassica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11895569\"]}");
	add("{\"term\":\"brassicaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11887994\"]}");
	add("{\"term\":\"brassie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02895867\"]}");
	add("{\"term\":\"brassiere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02896008\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }