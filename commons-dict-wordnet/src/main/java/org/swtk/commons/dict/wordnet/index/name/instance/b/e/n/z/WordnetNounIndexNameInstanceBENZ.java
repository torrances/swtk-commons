package org.swtk.commons.dict.wordnet.index.name.instance.b.e.n.z;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBENZ {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"benzedrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02833780\"]}");
	add("{\"term\":\"benzene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14798860\"]}");
	add("{\"term\":\"benzine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14798860\"]}");
	add("{\"term\":\"benzoate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14799226\"]}");
	add("{\"term\":\"benzocaine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02833905\"]}");
	add("{\"term\":\"benzodiazepine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02834036\"]}");
	add("{\"term\":\"benzofuran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14922252\"]}");
	add("{\"term\":\"benzoin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11726589\", \"14922092\"]}");
	add("{\"term\":\"benzol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14798860\"]}");
	add("{\"term\":\"benzoquinone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15025540\"]}");
	add("{\"term\":\"benzyl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14646801\"]}");
	add("{\"term\":\"benzylpenicillin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03916842\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }