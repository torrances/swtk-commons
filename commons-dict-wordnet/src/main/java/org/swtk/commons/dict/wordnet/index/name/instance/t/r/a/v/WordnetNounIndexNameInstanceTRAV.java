package org.swtk.commons.dict.wordnet.index.name.instance.t.r.a.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRAV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"travail\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00622867\", \"14071923\"]}");
	add("{\"term\":\"trave\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04482731\"]}");
	add("{\"term\":\"travel\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00283971\", \"07325733\", \"00296527\"]}");
	add("{\"term\":\"traveler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09652940\"]}");
	add("{\"term\":\"traveling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00296527\"]}");
	add("{\"term\":\"traveller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09652940\"]}");
	add("{\"term\":\"travelling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00296527\"]}");
	add("{\"term\":\"travelog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06627701\"]}");
	add("{\"term\":\"travelogue\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06627701\"]}");
	add("{\"term\":\"traversal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00297772\", \"00298873\"]}");
	add("{\"term\":\"traverse\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00297772\", \"00298873\", \"04480196\", \"04482731\"]}");
	add("{\"term\":\"traverser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10746668\"]}");
	add("{\"term\":\"travesty\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06793148\", \"07029364\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }