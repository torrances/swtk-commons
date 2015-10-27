package org.swtk.commons.dict.wordnet.index.name.instance.t.i.m.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTIMO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"timolol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04445876\"]}");
	add("{\"term\":\"timor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08928512\"]}");
	add("{\"term\":\"timorese\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10731415\"]}");
	add("{\"term\":\"timorousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04867990\", \"07537968\"]}");
	add("{\"term\":\"timothy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07818128\", \"11362761\", \"12151066\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }