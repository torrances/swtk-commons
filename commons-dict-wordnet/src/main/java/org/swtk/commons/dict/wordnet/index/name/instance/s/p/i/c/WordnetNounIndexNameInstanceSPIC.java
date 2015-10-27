package org.swtk.commons.dict.wordnet.index.name.instance.s.p.i.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPIC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"spic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09739802\"]}");
	add("{\"term\":\"spica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09465400\"]}");
	add("{\"term\":\"spiccato\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00102390\"]}");
	add("{\"term\":\"spice\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04999748\", \"07828160\", \"15074578\"]}");
	add("{\"term\":\"spiceberry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07759699\", \"12117913\"]}");
	add("{\"term\":\"spicebush\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11721771\", \"11726794\"]}");
	add("{\"term\":\"spicemill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04282212\"]}");
	add("{\"term\":\"spicery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04999748\"]}");
	add("{\"term\":\"spiciness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04909460\", \"04999748\"]}");
	add("{\"term\":\"spick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09739802\"]}");
	add("{\"term\":\"spicule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05480970\"]}");
	add("{\"term\":\"spiculum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05480970\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }