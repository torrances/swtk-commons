package org.swtk.commons.dict.wordnet.index.name.instance.c.h.i.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHIP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chip\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00377977\", \"00574567\", \"03023717\", \"03024099\", \"04700256\", \"07728304\", \"09266812\", \"03024246\", \"09244958\"]}");
	add("{\"term\":\"chipboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15127022\"]}");
	add("{\"term\":\"chipewyan\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06932787\", \"09672451\"]}");
	add("{\"term\":\"chipmunk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02362934\"]}");
	add("{\"term\":\"chipolata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07692170\"]}");
	add("{\"term\":\"chipotle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07737578\"]}");
	add("{\"term\":\"chippendale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10915798\"]}");
	add("{\"term\":\"chippewa\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06924142\", \"09683177\"]}");
	add("{\"term\":\"chippewaian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06932787\"]}");
	add("{\"term\":\"chippewyan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06932787\"]}");
	add("{\"term\":\"chipping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00377977\"]}");
	add("{\"term\":\"chips\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07726825\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }