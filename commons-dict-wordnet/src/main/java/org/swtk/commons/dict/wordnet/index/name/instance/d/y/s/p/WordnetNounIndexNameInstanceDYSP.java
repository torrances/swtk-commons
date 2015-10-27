package org.swtk.commons.dict.wordnet.index.name.instance.d.y.s.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDYSP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dyspepsia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14359722\"]}");
	add("{\"term\":\"dyspeptic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10060506\"]}");
	add("{\"term\":\"dysphagia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14082625\"]}");
	add("{\"term\":\"dysphasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14123267\"]}");
	add("{\"term\":\"dysphemism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06617749\"]}");
	add("{\"term\":\"dysphonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14425781\"]}");
	add("{\"term\":\"dysphoria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07554755\"]}");
	add("{\"term\":\"dysplasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14389355\"]}");
	add("{\"term\":\"dyspnea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14393149\"]}");
	add("{\"term\":\"dyspnoea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14393149\"]}");
	add("{\"term\":\"dysprosium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14660825\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }