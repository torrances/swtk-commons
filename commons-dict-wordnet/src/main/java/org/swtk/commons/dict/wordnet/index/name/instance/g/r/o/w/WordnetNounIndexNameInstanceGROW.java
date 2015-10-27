package org.swtk.commons.dict.wordnet.index.name.instance.g.r.o.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGROW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"grower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09799231\"]}");
	add("{\"term\":\"growing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13510047\", \"13510240\"]}");
	add("{\"term\":\"growl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07399073\"]}");
	add("{\"term\":\"growler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09318116\", \"10168648\"]}");
	add("{\"term\":\"growling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07399073\", \"07225611\"]}");
	add("{\"term\":\"grownup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09628463\"]}");
	add("{\"term\":\"growth\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"09318244\", \"14257556\", \"07339273\", \"08455059\", \"13518338\", \"13511546\", \"13510240\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }