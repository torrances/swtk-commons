package org.swtk.commons.dict.wordnet.index.name.instance.s.h.u.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHUT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"shutdown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00230127\"]}");
	add("{\"term\":\"shute\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11319202\"]}");
	add("{\"term\":\"shuteye\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14049560\"]}");
	add("{\"term\":\"shutout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07491635\"]}");
	add("{\"term\":\"shutter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04218423\", \"04218595\"]}");
	add("{\"term\":\"shutterbug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10614042\"]}");
	add("{\"term\":\"shutting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00344866\"]}");
	add("{\"term\":\"shuttle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04218924\", \"04219037\", \"04219349\"]}");
	add("{\"term\":\"shuttlecock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04219349\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }