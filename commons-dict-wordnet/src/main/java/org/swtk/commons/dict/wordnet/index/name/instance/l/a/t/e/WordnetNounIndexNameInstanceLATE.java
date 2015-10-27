package org.swtk.commons.dict.wordnet.index.name.instance.l.a.t.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLATE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"latecomer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10267417\"]}");
	add("{\"term\":\"lateen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03650891\"]}");
	add("{\"term\":\"latency\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14506436\", \"15298227\", \"15322312\"]}");
	add("{\"term\":\"lateness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05054210\"]}");
	add("{\"term\":\"lateral\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00562744\"]}");
	add("{\"term\":\"lateralisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06001509\"]}");
	add("{\"term\":\"laterality\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05005582\", \"05074176\", \"06001509\"]}");
	add("{\"term\":\"lateralization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06001509\"]}");
	add("{\"term\":\"lateran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08825406\"]}");
	add("{\"term\":\"laterite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14954303\"]}");
	add("{\"term\":\"lates\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02563014\"]}");
	add("{\"term\":\"latest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06655816\"]}");
	add("{\"term\":\"latex\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03651334\", \"15030685\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }