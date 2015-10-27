package org.swtk.commons.dict.wordnet.index.name.instance.s.h.o.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSHOO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"shoofly\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04208478\", \"10610755\"]}");
	add("{\"term\":\"shook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04208661\"]}");
	add("{\"term\":\"shoot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00123774\", \"13185661\"]}");
	add("{\"term\":\"shooter\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"10171603\", \"10610889\", \"10611086\", \"10612523\", \"04403228\"]}");
	add("{\"term\":\"shooting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00226017\", \"00123481\"]}");
	add("{\"term\":\"shootout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00125437\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }