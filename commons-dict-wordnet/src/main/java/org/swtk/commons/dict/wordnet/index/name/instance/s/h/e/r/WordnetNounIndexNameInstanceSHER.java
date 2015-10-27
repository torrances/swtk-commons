package org.swtk.commons.dict.wordnet.index.name.instance.s.h.e.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHER {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sheraton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04199564\"]}");
	add("{\"term\":\"sherbert\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07630898\"]}");
	add("{\"term\":\"sherbet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07630898\"]}");
	add("{\"term\":\"sherd\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04191744\"]}");
	add("{\"term\":\"sheridan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11317585\"]}");
	add("{\"term\":\"sheriff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10608548\"]}");
	add("{\"term\":\"sherlock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10496256\"]}");
	add("{\"term\":\"sherman\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"09169061\", \"09454806\", \"11317746\", \"11317973\"]}");
	add("{\"term\":\"sherpa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09752442\"]}");
	add("{\"term\":\"sherrington\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11318230\"]}");
	add("{\"term\":\"sherry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07917198\"]}");
	add("{\"term\":\"sherwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11318393\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }