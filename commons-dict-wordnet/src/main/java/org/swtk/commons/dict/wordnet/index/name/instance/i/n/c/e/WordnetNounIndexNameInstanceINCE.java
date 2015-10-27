package org.swtk.commons.dict.wordnet.index.name.instance.i.n.c.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINCE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"incendiarism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00379104\"]}");
	add("{\"term\":\"incendiary\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03571171\", \"09830112\"]}");
	add("{\"term\":\"incense\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05722692\", \"14943145\"]}");
	add("{\"term\":\"incentive\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13294177\", \"09202673\"]}");
	add("{\"term\":\"inception\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07338522\"]}");
	add("{\"term\":\"incertitude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05706212\"]}");
	add("{\"term\":\"incessancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05059738\"]}");
	add("{\"term\":\"incessantness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05059738\"]}");
	add("{\"term\":\"incest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00850521\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }