package org.swtk.commons.dict.wordnet.index.name.instance.r.e.a.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREAS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"reason\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"05827293\", \"06753097\", \"14403234\", \"05659525\", \"06752739\", \"09201896\"]}");
	add("{\"term\":\"reasonableness\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04791152\", \"05125362\", \"05154151\", \"05167957\", \"14403234\"]}");
	add("{\"term\":\"reasoner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10529932\"]}");
	add("{\"term\":\"reasoning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05780353\"]}");
	add("{\"term\":\"reassembly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00270700\"]}");
	add("{\"term\":\"reassertion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06745330\"]}");
	add("{\"term\":\"reassessment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05755527\"]}");
	add("{\"term\":\"reassignment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00733374\"]}");
	add("{\"term\":\"reassurance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01218209\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }