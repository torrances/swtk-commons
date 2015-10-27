package org.swtk.commons.dict.wordnet.index.name.instance.s.t.o.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTOR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"storage\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00373415\", \"03749767\", \"13583336\", \"00813322\", \"04336328\", \"00813016\"]}");
	add("{\"term\":\"storax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12797939\"]}");
	add("{\"term\":\"store\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04336328\", \"03749767\", \"13388243\", \"04209460\"]}");
	add("{\"term\":\"storefront\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04210748\"]}");
	add("{\"term\":\"storehouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04336328\"]}");
	add("{\"term\":\"storekeeper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10611560\"]}");
	add("{\"term\":\"storeria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01740816\"]}");
	add("{\"term\":\"storeroom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04336615\"]}");
	add("{\"term\":\"storey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03370837\"]}");
	add("{\"term\":\"stork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02004729\"]}");
	add("{\"term\":\"storksbill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12709477\"]}");
	add("{\"term\":\"storm\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00976716\", \"14001791\", \"11482925\"]}");
	add("{\"term\":\"storminess\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07496765\", \"14547038\"]}");
	add("{\"term\":\"story\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"06769768\", \"06694296\", \"06526084\", \"03370837\", \"06381452\", \"07235754\"]}");
	add("{\"term\":\"storybook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06425102\"]}");
	add("{\"term\":\"storyline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06385268\"]}");
	add("{\"term\":\"storyteller\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10679772\", \"10365535\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }