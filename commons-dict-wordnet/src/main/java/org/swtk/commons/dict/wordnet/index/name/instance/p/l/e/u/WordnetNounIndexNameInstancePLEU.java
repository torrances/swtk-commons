package org.swtk.commons.dict.wordnet.index.name.instance.p.l.e.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePLEU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pleura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05395458\"]}");
	add("{\"term\":\"pleuralgia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14353451\"]}");
	add("{\"term\":\"pleurisy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14196495\"]}");
	add("{\"term\":\"pleurobrachia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01922943\"]}");
	add("{\"term\":\"pleurobrachiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01922819\"]}");
	add("{\"term\":\"pleurocarp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11559918\"]}");
	add("{\"term\":\"pleurodont\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01327701\"]}");
	add("{\"term\":\"pleurodynia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14353451\"]}");
	add("{\"term\":\"pleuronectes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02661011\"]}");
	add("{\"term\":\"pleuronectidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02660435\"]}");
	add("{\"term\":\"pleuropneumonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14196777\"]}");
	add("{\"term\":\"pleurosorus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13204567\"]}");
	add("{\"term\":\"pleurothallis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12100024\"]}");
	add("{\"term\":\"pleurotus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13027955\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }