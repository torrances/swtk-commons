package org.swtk.commons.dict.wordnet.index.name.instance.p.o.t.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePOTH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pothead\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10479759\"]}");
	add("{\"term\":\"pother\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14427176\"]}");
	add("{\"term\":\"potherb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07724917\"]}");
	add("{\"term\":\"potholder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03998473\"]}");
	add("{\"term\":\"pothole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09420951\"]}");
	add("{\"term\":\"potholer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10479852\"]}");
	add("{\"term\":\"pothook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03998566\"]}");
	add("{\"term\":\"pothos\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11809196\", \"11812498\"]}");
	add("{\"term\":\"pothouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04024793\"]}");
	add("{\"term\":\"pothunter\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10480067\", \"10480165\", \"10480286\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }