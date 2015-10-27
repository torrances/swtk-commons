package org.swtk.commons.dict.wordnet.index.name.instance.o.u.t.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOUTS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"outset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15290329\"]}");
	add("{\"term\":\"outside\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08631047\", \"08631168\"]}");
	add("{\"term\":\"outsider\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10407891\", \"10123690\"]}");
	add("{\"term\":\"outsize\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05103839\"]}");
	add("{\"term\":\"outskirt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08708530\"]}");
	add("{\"term\":\"outskirts\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08556839\"]}");
	add("{\"term\":\"outsole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03867710\"]}");
	add("{\"term\":\"outspokenness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04658088\"]}");
	add("{\"term\":\"outstation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08631560\"]}");
	add("{\"term\":\"outstroke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07366097\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }