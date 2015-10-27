package org.swtk.commons.dict.wordnet.index.name.instance.t.a.p.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTAPP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tappa\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04398532\", \"13183843\"]}");
	add("{\"term\":\"tappan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11351187\"]}");
	add("{\"term\":\"tapper\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"10710644\", \"10710814\", \"10710981\", \"10711096\", \"10711260\"]}");
	add("{\"term\":\"tappet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04400901\"]}");
	add("{\"term\":\"tapping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07411258\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }