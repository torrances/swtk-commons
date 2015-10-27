package org.swtk.commons.dict.wordnet.index.name.instance.f.i.n.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFING {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"finger\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03346098\", \"13675079\", \"05574137\"]}");
	add("{\"term\":\"fingerboard\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03346242\", \"03935052\", \"06807394\"]}");
	add("{\"term\":\"fingerbreadth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13675079\"]}");
	add("{\"term\":\"fingerflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12903705\"]}");
	add("{\"term\":\"fingering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00141720\", \"01055131\"]}");
	add("{\"term\":\"fingerling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02515383\"]}");
	add("{\"term\":\"fingermark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04702328\"]}");
	add("{\"term\":\"fingernail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05591915\"]}");
	add("{\"term\":\"fingerpaint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03346960\"]}");
	add("{\"term\":\"fingerpointing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07251894\"]}");
	add("{\"term\":\"fingerpost\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06807394\"]}");
	add("{\"term\":\"fingerprint\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04702328\", \"06899538\", \"06657156\"]}");
	add("{\"term\":\"fingerprinting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00153158\"]}");
	add("{\"term\":\"fingerroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12903705\"]}");
	add("{\"term\":\"fingerspelling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06888933\"]}");
	add("{\"term\":\"fingerstall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03347377\"]}");
	add("{\"term\":\"fingertip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05574750\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }