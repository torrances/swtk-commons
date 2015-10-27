package org.swtk.commons.dict.wordnet.index.name.instance.s.c.h.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSCHL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"schleiden\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11304531\"]}");
	add("{\"term\":\"schlemiel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10576253\"]}");
	add("{\"term\":\"schlep\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00311251\", \"10576381\"]}");
	add("{\"term\":\"schlepper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10576381\"]}");
	add("{\"term\":\"schlesien\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09189327\"]}");
	add("{\"term\":\"schlesinger\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11304732\", \"11304874\"]}");
	add("{\"term\":\"schliemann\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11305081\"]}");
	add("{\"term\":\"schlimazel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10576522\"]}");
	add("{\"term\":\"schlock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04152800\"]}");
	add("{\"term\":\"schlockmeister\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10576674\"]}");
	add("{\"term\":\"schlumbergera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11873660\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }