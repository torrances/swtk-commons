package org.swtk.commons.dict.wordnet.index.name.instance.n.e.o.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNEOP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"neopallium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05489398\"]}");
	add("{\"term\":\"neophobia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14407366\"]}");
	add("{\"term\":\"neophron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01620274\"]}");
	add("{\"term\":\"neophyte\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09920955\", \"10375148\", \"11574085\"]}");
	add("{\"term\":\"neoplasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13542052\"]}");
	add("{\"term\":\"neoplasm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14258682\"]}");
	add("{\"term\":\"neoplatonism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05982470\"]}");
	add("{\"term\":\"neoplatonist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10372968\"]}");
	add("{\"term\":\"neopolitan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09736233\"]}");
	add("{\"term\":\"neoprene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15031944\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }