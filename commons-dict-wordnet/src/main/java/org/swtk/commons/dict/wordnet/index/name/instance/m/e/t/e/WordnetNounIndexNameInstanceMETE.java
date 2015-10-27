package org.swtk.commons.dict.wordnet.index.name.instance.m.e.t.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMETE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mete\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08529808\"]}");
	add("{\"term\":\"metempsychosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11429028\"]}");
	add("{\"term\":\"metencephalon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05489649\"]}");
	add("{\"term\":\"meteor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11504390\", \"09376006\"]}");
	add("{\"term\":\"meteorite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09375746\"]}");
	add("{\"term\":\"meteoroid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09376006\"]}");
	add("{\"term\":\"meteorologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10331945\"]}");
	add("{\"term\":\"meteorology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06128170\", \"06762443\"]}");
	add("{\"term\":\"meteortropism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00863848\"]}");
	add("{\"term\":\"meter\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04998860\", \"07108759\", \"03758568\", \"13681046\"]}");
	add("{\"term\":\"meterstick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03759005\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }