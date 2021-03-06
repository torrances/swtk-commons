package org.swtk.commons.dict.wordnet.indexbyname.instance.a.m.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAMN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"amnesia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05680235\"]}");
	add("{\"term\":\"amnesiac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09808052\"]}");
	add("{\"term\":\"amnesic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09808052\"]}");
	add("{\"term\":\"amnesic aphasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14122145\"]}");
	add("{\"term\":\"amnestic aphasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14122145\"]}");
	add("{\"term\":\"amnesty\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01251862\", \"06564630\", \"14552684\"]}");
	add("{\"term\":\"amnio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00945416\"]}");
	add("{\"term\":\"amniocentesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00945416\"]}");
	add("{\"term\":\"amnion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01475279\"]}");
	add("{\"term\":\"amnionic fluid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05406970\"]}");
	add("{\"term\":\"amnios\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01475279\"]}");
	add("{\"term\":\"amniota\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01474944\"]}");
	add("{\"term\":\"amniote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01475143\"]}");
	add("{\"term\":\"amniotic cavity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05406829\"]}");
	add("{\"term\":\"amniotic fluid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05406970\"]}");
	add("{\"term\":\"amniotic sac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01475279\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }