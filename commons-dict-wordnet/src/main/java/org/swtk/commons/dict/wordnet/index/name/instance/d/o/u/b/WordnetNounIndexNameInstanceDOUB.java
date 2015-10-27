package org.swtk.commons.dict.wordnet.index.name.instance.d.o.u.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDOUB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"double\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00805055\", \"05868784\", \"10046971\", \"10686285\", \"00133576\"]}");
	add("{\"term\":\"doubleheader\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00462012\"]}");
	add("{\"term\":\"doubler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03232424\"]}");
	add("{\"term\":\"doubles\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00484519\", \"00484616\"]}");
	add("{\"term\":\"doublespeak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06774193\"]}");
	add("{\"term\":\"doublet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03232957\"]}");
	add("{\"term\":\"doublethink\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05734182\"]}");
	add("{\"term\":\"doubleton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13766009\"]}");
	add("{\"term\":\"doubletree\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03233068\"]}");
	add("{\"term\":\"doubling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00805055\", \"13490729\"]}");
	add("{\"term\":\"doubloon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13414069\"]}");
	add("{\"term\":\"doubt\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04764777\", \"05706212\"]}");
	add("{\"term\":\"doubter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09798565\", \"10624042\"]}");
	add("{\"term\":\"doubtfulness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04764777\", \"05706212\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }