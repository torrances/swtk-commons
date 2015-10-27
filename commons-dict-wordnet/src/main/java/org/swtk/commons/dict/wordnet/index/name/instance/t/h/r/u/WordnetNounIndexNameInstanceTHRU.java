package org.swtk.commons.dict.wordnet.index.name.instance.t.h.r.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTHRU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"thrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07411830\"]}");
	add("{\"term\":\"thrush\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01559826\", \"10729525\", \"14206050\"]}");
	add("{\"term\":\"thrust\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00335761\", \"06724343\", \"00104654\", \"01176455\", \"11518603\"]}");
	add("{\"term\":\"thruster\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04437739\", \"10515341\"]}");
	add("{\"term\":\"thrusting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00335761\"]}");
	add("{\"term\":\"thruway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03311555\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }