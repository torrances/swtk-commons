package org.swtk.commons.dict.wordnet.indexbyname.instance.a.l.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceALO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"alocasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11802505\"]}");
	add("{\"term\":\"aloe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12457182\"]}");
	add("{\"term\":\"aloeaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12456765\"]}");
	add("{\"term\":\"aloes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02701225\"]}");
	add("{\"term\":\"aloha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06644428\"]}");
	add("{\"term\":\"aloneness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04629772\"]}");
	add("{\"term\":\"alonso\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10834947\"]}");
	add("{\"term\":\"aloofness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04664353\", \"07521110\"]}");
	add("{\"term\":\"alopecia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14480809\"]}");
	add("{\"term\":\"alopecurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12128006\"]}");
	add("{\"term\":\"alopex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02122613\"]}");
	add("{\"term\":\"alopiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01488314\"]}");
	add("{\"term\":\"alopius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01488442\"]}");
	add("{\"term\":\"alosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02532925\"]}");
	add("{\"term\":\"alouatta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02495167\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }