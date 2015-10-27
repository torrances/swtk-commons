package org.swtk.commons.dict.wordnet.index.name.instance.b.r.a.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBRAH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"brahe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10881522\"]}");
	add("{\"term\":\"brahma\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02407225\", \"09548056\"]}");
	add("{\"term\":\"brahman\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02407225\", \"08323889\", \"09892023\", \"09892248\"]}");
	add("{\"term\":\"brahmana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06477127\"]}");
	add("{\"term\":\"brahmanism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06248001\", \"08113916\"]}");
	add("{\"term\":\"brahmaputra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09251051\"]}");
	add("{\"term\":\"brahmi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06364025\"]}");
	add("{\"term\":\"brahmin\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02407225\", \"08323889\", \"09892023\", \"09892248\"]}");
	add("{\"term\":\"brahminism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06248001\", \"08113916\"]}");
	add("{\"term\":\"brahms\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07292851\", \"10881709\"]}");
	add("{\"term\":\"brahui\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06995241\", \"09745349\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }