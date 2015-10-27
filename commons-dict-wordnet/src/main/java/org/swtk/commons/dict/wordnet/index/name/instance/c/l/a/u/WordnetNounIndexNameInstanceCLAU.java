package org.swtk.commons.dict.wordnet.index.name.instance.c.l.a.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLAU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"claudication\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14573529\"]}");
	add("{\"term\":\"claudius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10919166\"]}");
	add("{\"term\":\"clause\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06404578\", \"06325134\"]}");
	add("{\"term\":\"clausewitz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10919499\"]}");
	add("{\"term\":\"claustrophobe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09946449\"]}");
	add("{\"term\":\"claustrophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14406657\"]}");
	add("{\"term\":\"claustrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05505573\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }