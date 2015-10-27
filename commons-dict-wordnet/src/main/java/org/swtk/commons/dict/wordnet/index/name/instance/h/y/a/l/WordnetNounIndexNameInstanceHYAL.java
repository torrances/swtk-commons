package org.swtk.commons.dict.wordnet.index.name.instance.h.y.a.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHYAL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hyalin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14933854\"]}");
	add("{\"term\":\"hyaline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14933854\"]}");
	add("{\"term\":\"hyalinisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14100291\"]}");
	add("{\"term\":\"hyalinization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14100291\"]}");
	add("{\"term\":\"hyaloid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05327138\"]}");
	add("{\"term\":\"hyalophora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02305819\"]}");
	add("{\"term\":\"hyaloplasm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05441629\"]}");
	add("{\"term\":\"hyalosperma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12004208\"]}");
	add("{\"term\":\"hyalospongiae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01910136\"]}");
	add("{\"term\":\"hyaluronidase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14934316\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }